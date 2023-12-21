public class SubscriptionAccount extends BankAccount{
    SubscriptionAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant) {
        super(bankCode, accountNo, owner, balance, password, isDormant);
    }
    int numOfSubscrition;
}
