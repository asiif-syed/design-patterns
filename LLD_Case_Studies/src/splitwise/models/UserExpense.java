package splitwise.models;

public class UserExpense {
    private User user;
    private Expense expense;
    private UserExpenseType type;
    private int amount;

    public UserExpense(User user, Expense expense, int amount, UserExpenseType type) {
        this.user = user;
        this.expense = expense;
        this.type = type;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public Expense getExpense() {
        return expense;
    }

    public UserExpenseType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
