package splitwise.models;

import java.util.List;

public class Group {
    private String name;
    private List<User> users;
    private List<Expense> expenses;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
