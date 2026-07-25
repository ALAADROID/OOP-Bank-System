public class Bank {
    public Bank() {}

    @Override
    public String toString() {
        return "I'm representing the BANK";
    }

    public boolean Transfer(BankAccount sender, BankAccount receiver, float amount) {
        if (sender.CanWithdraw(amount)) {
            sender.Withdraw(amount);
            receiver.Deposit(amount);
            return true;
        }
        return false;
    }
}