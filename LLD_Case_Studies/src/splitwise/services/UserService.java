package splitwise.services;

import splitwise.dtos.Transaction;
import splitwise.models.*;
import splitwise.repositories.GroupRepository;
import splitwise.repositories.UserExpenseRepository;
import splitwise.strategy.SettleUpStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private GroupRepository groupRepository;
    private UserExpenseRepository userExpenseRepository;
    private SettleUpStrategy settleUpStrategy;

    public UserService(GroupRepository groupRepository, UserExpenseRepository userExpenseRepository, SettleUpStrategy settleUpStrategy) {
        this.groupRepository = groupRepository;
        this.userExpenseRepository = userExpenseRepository;
        this.settleUpStrategy = settleUpStrategy;
    }

    /*
                    GOA TRIP [A, B, C, D]

        (E1)
            Expense 1 : Dinner, 2000, Regular

            whoPaid : [A:1000, B:1000]
            whoHadToPay : [A:500, B:500, C: 500: D: 500]

         UserExpenses
            user expense   amount   type
             A      e1      1000   WhoPaid
             B      e1      1000   WhoPaid

             A      e1      500   WhoHadToPay
             B      e1      500   WhoHadToPay
             C      e1      500   WhoHadToPay
             D      e1      500   WhoHadToPay

         ExtraAmount map
            initial : [A: 0, B:0, C:0, D:0]

            A = 0+1000 = 1000
            B = 0+1000 = 1000
            A = 1000-500 = 500
            B = 1000-500 = 500
            C = 0-500 = -500
            D = 0-500 =-500

            updated : [A: 500, B:500, C:-500, D:-500]

          HeapStrategy -> (updatedMap)

            Givers : [C:-500, D:-500]
            Receivers : [A:500, B: 500]

            Transactions :
                from to amount
                  C  A   500
                  D  B   500

                If you're only trying to settle C
                    C A 500




     */

    /*
        1. Get all expense of the group
        2. For every expense, I'll find the userExpenses
        3. Go through all the user expenses and correspondingly update the extra_amount
            for each user
        4. Pass this extra amount map to a strategy which will return a list<Transaction>

    TO-DO
        5. Filter the transactions that contains this user either in 'from' or in 'to'
     */

    public List<Transaction> settleGroup(String groupName){
        Group group = groupRepository.findGroupByName(groupName);
        List<Expense> groupExpenses = group.getExpenses();
        // To create extra amount for each user
        Map<User, Integer> extraAmountMap = new HashMap<>();
        for(Expense expense: groupExpenses){
            //  Get UserExpenses for each expense of the group
            List<UserExpense> userExpenseList = userExpenseRepository.findUserExpensesByExpenseDescription(expense.getDescription());
            for(UserExpense userExpense: userExpenseList){
                User user = userExpense.getUser();
                // Create extra amount for each user after each expense
                if(!extraAmountMap.containsKey(user)){
                    extraAmountMap.put(user, 0);
                }
                Integer userAmount = extraAmountMap.get(user);
                if(userExpense.getType().equals(UserExpenseType.PAID_BY)){
                    userAmount += userExpense.getAmount();
                } else{
                    userAmount -= userExpense.getAmount();
                }
                extraAmountMap.put(user, userAmount);
            }
        }
        return settleUpStrategy.settleUser(extraAmountMap);
    }
    public List<Transaction> settleUser(String username, String groupName){
        List<Transaction> groupTransactions = settleGroup(groupName);
        List<Transaction> userTransactions = new ArrayList<>();
        for(Transaction transaction : groupTransactions){
            if(transaction.getFrom().equalsIgnoreCase(username) || transaction.getTo().equalsIgnoreCase(username)){
                userTransactions.add(transaction);
            }
        }
        return userTransactions;
    }
}
