package Esame;

public class TestLibraryAccount {
    public static void main(String[] args) {
        
        LibraryAccount acc1 = new LibraryAccount("Mario Rossi", 3);
        LibraryAccount acc2 = new LibraryAccount("Luisa Bianchi");

        System.out.println(acc1); // toString
        System.out.println(acc2);

        acc1.borrow(2); // borrow
        acc2.borrow(1);

        System.out.println("Dopo aver preso in prestito libri:");
        System.out.println(acc1);
        System.out.println(acc2);

        acc1.returnBooks(1); // returnBooks
        acc2.returnBooks(2); // restituisce più di quanto ha preso (errore)

        System.out.println("Dopo la restituzione dei libri:");
        System.out.println(acc1);
        System.out.println(acc2);

        acc1.setMemberName("Giovanni Verdi"); // setMemberName
        System.out.println("Nuovo nome per acc1: " + acc1.getMemberName()); // getMemberName

        System.out.println("Totale account creati: " + LibraryAccount.getNumAccounts()); // static method

        // Test LibraryAccountYoung
        System.out.println("\n=== Test LibraryAccountYoung ===");
        LibraryAccountYoung youngAcc = new LibraryAccountYoung("Paolo Piccolo", 3);

        System.out.println(youngAcc); // toString (ereditato da LibraryAccount)

        youngAcc.borrow(2); // OK
        youngAcc.borrow(2); // supera limite -> errore

        System.out.println("Dopo i tentativi di prestito:");
        System.out.println(youngAcc);

        youngAcc.returnBooks(1); // OK
        youngAcc.returnBooks(5); // errore

        System.out.println("Dopo le restituzioni:");
        System.out.println(youngAcc);
    }
}