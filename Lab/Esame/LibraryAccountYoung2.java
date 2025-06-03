package Esame;

public class LibraryAccountYoung2 extends LibraryAccount2{
    private int maxBooks;
    
    public LibraryAccountYoung2(String memberName, int maxBooks) {
        super(memberName, maxBooks);
        this.maxBooks = maxBooks;
    }
    

    @Override
    public void borrow(int n) {
        if(n > 0) 
            System.out.println("Valore non valido!");
        else if(n > maxBooks)  
            System.out.println("La tua richiesta eccede di " + (n-maxBooks) + 
                               "libri rispetto al massimo consentito, prestito non consentito!");
        else {
            int booksBorrowed = super.getBooksBorrowed();
            booksBorrowed += n;

            System.out.println("Prestito avvenuto con successo");
        }
    }
}
