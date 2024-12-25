package splitwise.controllers;

import splitwise.dtos.Transaction;
import splitwise.models.*;
import splitwise.repositories.GroupRepository;
import splitwise.repositories.UserExpenseRepository;
import splitwise.services.UserService;
import splitwise.strategy.HeapSettleUpStrategy;
import splitwise.strategy.SettleUpStrategy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        SettleUpStrategy settleUpStrategy = new HeapSettleUpStrategy();
        //Create a Group
        Group group = new Group("GOA GUYS");
        // Create & Add users
        User amir = new User("Amir", "amir@gmail.com", "1234", "1234567890");
        User shreyasi = new User("Shreyasi",  "shreyasi@gmail.com", "1234", "1234567891");
        User tanay = new User("Tanay", "tanay@gmail.com",  "1234", "1234567892");
        User shubham = new User("Shubham",  "shubham@gmail.com", "1234", "1234567893");
        group.setUsers(Arrays.asList(amir, shreyasi, tanay, shubham));

        // Add expense
        Expense dinnerExpense = new Expense("Dinner", 5000, ExpenseType.ORIGINAL);
        group.setExpenses(Arrays.asList(dinnerExpense));

        // Create user expenses
        // A : 500, B:500, C:500
        // D : -1500
        UserExpense uE1 = new UserExpense(amir, dinnerExpense, 500, UserExpenseType.PAID_BY);
        UserExpense uE2 = new UserExpense(shreyasi, dinnerExpense, 500, UserExpenseType.PAID_BY);
        UserExpense uE5 = new UserExpense(tanay, dinnerExpense, 500, UserExpenseType.PAID_BY);

        UserExpense uE3 = new UserExpense(amir, dinnerExpense, 0, UserExpenseType.HAD_TO_PAY);
        UserExpense uE4 = new UserExpense(shreyasi, dinnerExpense, 0, UserExpenseType.HAD_TO_PAY);
        UserExpense uE6 = new UserExpense(shubham, dinnerExpense, 1500, UserExpenseType.HAD_TO_PAY);

        // Add created group to the group repo
        Map<String, Group> groupMap = new HashMap<>();
        groupMap.put("GOA GUYS", group);
        GroupRepository groupRepository = new GroupRepository(groupMap);

        // Create user repo
        UserExpenseRepository userExpenseRepository = new UserExpenseRepository(Arrays.asList(uE1, uE2, uE3, uE4, uE5, uE6));

        // Create user service
        UserService userService = new UserService(groupRepository, userExpenseRepository, settleUpStrategy);

        // Create user controller
        UserController userController = new UserController(userService);
        List<Transaction> transactions = userController.settleUser("tanay", "GOA GUYS");

        for (Transaction transaction: transactions){
            System.out.println("From: " + transaction.getFrom() + ", To: " + transaction.getTo() + ", Amount: "  + transaction.getAmount());
        }
    }
}
