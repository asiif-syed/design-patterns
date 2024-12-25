package splitwise.controllers;

import splitwise.dtos.Transaction;
import splitwise.services.UserService;

import java.util.List;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public List<Transaction> settleUser(String username, String groupName){
        return userService.settleUser(username, groupName);
    }
    public List<Transaction> settleGroup(String groupName){
        return userService.settleGroup(groupName);
    }
    public void printUserTransactions(List<Transaction> transactions){
        for (Transaction transaction: transactions){
            System.out.println("From: " + transaction.getFrom() + ", To: " + transaction.getTo() + ", Amount: "  + transaction.getAmount());
        }
    }
}
