public class Main {
    public static void main(String[] args) {
    
        runScenario(1, 50.0f);
        runScenario(2, 100.0f);
        runScenario(3, 150.0f);
    }

    public static void runScenario(int exampleNum, float transferAmount) {
        CheckingAccount ali = new CheckingAccount("Ali", 50.0f);
        BankAccount ayse = new BankAccount("Ayse");
        
        ali.Deposit(100.0f);
        ayse.Deposit(300.0f);
        
        CommissionBank bank = new CommissionBank(0.10f); // 10%

        System.out.println("Example " + exampleNum);
        System.out.println("Before transfer");
        System.out.println(bank); // يطبع نسبة العمولة ورصيد البنك (0)
        System.out.println(ali);
        System.out.println(ayse);
        System.out.println("Bank has a balance of 0");

        // تنفيذ التحويل
        bank.Transfer(ali, ayse, transferAmount);

        System.out.println("After Ali sends " + (int)transferAmount + " to Ayse");
        System.out.println(ali);
        System.out.println(ayse);
        System.out.println(bank); // يطبع رصيد البنك بعد العمولة
        System.out.println();
    }
}