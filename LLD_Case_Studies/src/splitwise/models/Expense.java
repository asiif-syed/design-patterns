package splitwise.models;

public class Expense {
    private String description;
    private int amount;
    private ExpenseType type;

    public Expense( String description, int amount, ExpenseType type) {
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
}
