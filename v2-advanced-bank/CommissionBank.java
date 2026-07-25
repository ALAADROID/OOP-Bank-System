class CommissionBank extends Bank {
    float commissionRate;
    float balance; 

    public CommissionBank(float commissionRate) {
        this.commissionRate = commissionRate;
        this.balance = 0.0f;
    }

    @Override
    public boolean Transfer(BankAccount sender, BankAccount receiver, float amount) {
        // العمولة تحسب على المبلغ المحول، وتُخصم مع المبلغ من المرسل
        float commission = amount * commissionRate;
        float totalToSubtract = amount + commission;

        if (sender.CanWithdraw(totalToSubtract)) {
            sender.Withdraw(totalToSubtract);
            receiver.Deposit(amount);
            balance += commission;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        // تحويل نسبة العمولة إلى مئوية
        int ratePercent = (int) (commissionRate * 100);
        return "Bank has a commission rate of " + ratePercent + "%\n" +
               "Bank has a balance of " + String.format("%.0f", balance);
    }
}