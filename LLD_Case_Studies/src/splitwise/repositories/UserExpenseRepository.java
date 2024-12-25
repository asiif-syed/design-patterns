package splitwise.repositories;

import splitwise.models.UserExpense;

import java.util.ArrayList;
import java.util.List;

public class UserExpenseRepository {
    private List<UserExpense> userExpenses = new ArrayList<>();

    public UserExpenseRepository(List<UserExpense> userExpenses) {
        this.userExpenses = userExpenses;
    }

    public List<UserExpense> findUserExpensesByExpenseDescription(String description){
        List<UserExpense> userExpenseList = new ArrayList<>();
        for(UserExpense userExpense : this.userExpenses){
            if(userExpense.getExpense().getDescription().equalsIgnoreCase(description)){
                userExpenseList.add(userExpense);
            }
        }
        return userExpenseList;
    }
}
