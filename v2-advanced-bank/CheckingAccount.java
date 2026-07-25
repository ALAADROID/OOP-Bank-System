class CheckingAccount extends BankAccount {
    float overdraftLimit;

    public CheckingAccount(String id, float overdraftLimit) {
        super(id);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean CanWithdraw(float amount) {
        return amount > 0 && (balance + overdraftLimit) >= amount;
    }

    @Override
    public String toString() {
        return id + " has a balance of " + String.format("%.0f", balance) + ", overdraftLimit " + String.format("%.0f", overdraftLimit);
    }
}