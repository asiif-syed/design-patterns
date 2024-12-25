package splitwise.strategy;

import splitwise.dtos.Transaction;
import splitwise.models.User;

import java.util.List;
import java.util.Map;

public interface SettleUpStrategy {
    public List<Transaction> settleUser(Map<User, Integer> extraAmountMap);
}
