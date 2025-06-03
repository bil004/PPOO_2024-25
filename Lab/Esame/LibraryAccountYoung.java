package Esame;

class LibraryAccountYoung extends LibraryAccount {
    private int maxBooks;
    
    public LibraryAccountYoung(String memberName, int maxBooks) {
        super(memberName, maxBooks);
        this.maxBooks = maxBooks;
    }
    

    @Override
    public void borrow(int n) {
        assert(n > 0) : "Valore non valido!";
        assert(n <= maxBooks) : "La tua richiesta eccede di " + (n-maxBooks) + "libri rispetto al massimo consentito, prestito non consentito!";
        
        int booksBorrowed = super.getBooksBorrowed();
        booksBorrowed += n;
        System.out.println("Prestito avvenuto con successo");
    }
}