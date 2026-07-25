public class Main {
    public static void main(String[] args) {
        // Example 1
        BankAccount ali = new BankAccount("Ali");
        BankAccount ayse = new BankAccount("Ayse");
        
        ali.Deposit(100.0f);
        ayse.Deposit(300.0f);

        System.out.println("Before transfer");
        System.out.println(ali);
        System.out.println(ayse);

        Bank bank = new Bank();
        bank.Transfer(ali, ayse, 50.0f);
        
        System.out.println("After Ali sends 50 to Ayse");
        System.out.println(ali);
        System.out.println(ayse);
        System.out.println();

        // Example 2
        BankAccount ali2 = new BankAccount("Ali");
        BankAccount ayse2 = new BankAccount("Ayse");
        
        ali2.Deposit(100.0f);
        ayse2.Deposit(300.0f);

        System.out.println("Before transfer");
        System.out.println(ali2);
        System.out.println(ayse2);

        Bank bank2 = new Bank();
        bank2.Transfer(ali2, ayse2, 150.0f);
        
        System.out.println("After Ali sends 150 to Ayse");
        System.out.println(ali2);
        System.out.println(ayse2);
    }
}

