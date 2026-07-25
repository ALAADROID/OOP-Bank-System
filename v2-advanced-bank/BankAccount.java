public class BankAccount {
    String id;
    protected float balance;

    public BankAccount(String id) {
        this.id = id;
        this.balance = 0.0f;
    }

    public void Deposit(float amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void Withdraw(float amount) {
        if (CanWithdraw(amount)) {
            balance -= amount;
        }
    }

    public boolean CanWithdraw(float amount) {
        return amount > 0 && balance >= amount;
    }

    @Override
    public String toString() {
        return id + " has a balance of " + String.format("%.0f", balance);
    }
}