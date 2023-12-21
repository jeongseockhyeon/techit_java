public class SavingsAccount extends BankAccount implements Withdrawable{
    SavingsAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant) {
        super(bankCode, accountNo, owner, balance, password, isDormant);
    }

    boolean isOverdraft;
    void transfer(){}

    public void withdraw() {
        System.out.println("Withdraw");
    }
}
