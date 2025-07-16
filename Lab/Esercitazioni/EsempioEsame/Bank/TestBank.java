package Bank;

public class TestBank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Mario Rossi", 1000);
        BankAccount acc2 = new BankAccount("Luigi Bianchi");
        BankAccountYoung accY = new BankAccountYoung("Giulia Verdi", 800);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(accY);

        acc1.deposit(200);
        acc2.deposit(500);
        accY.deposit(100);

        acc1.withdraw(300);
        acc2.withdraw(600); // fondi insufficienti
        accY.withdraw(600); // supera limite
        accY.withdraw(400); // ok

        System.out.println("\nDopo le operazioni:");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(accY);

        System.out.println("\nNumero conti creati: " + BankAccount.getNumAccounts());
    }
}
