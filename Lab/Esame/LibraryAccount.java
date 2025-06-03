package Esame;

public class LibraryAccount {
    static int counter = 0;
    private int id;
    private String memberName;
    private int booksBorrowed;
    
    public LibraryAccount(String memberName, int booksBorrowed) {
        assert(memberName != null && booksBorrowed >= 0) : "Valori non ammessi";
        counter++;
        id = counter;
        this.memberName = memberName;
        this.booksBorrowed = booksBorrowed;
    }
    
    public LibraryAccount(String memberName) {
        assert(memberName != null) : "Valore non ammessi";
        counter++;
        id = counter;
        this.memberName = memberName;
        booksBorrowed = 0;
    }
    
    public int getBooksBorrowed() {
        return booksBorrowed;
    }
    
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    @Override
    public String toString() {
        return "LibraryAccount[id=" + id + ", memberName=" + memberName + ", numero libri=" + booksBorrowed + "]";
    }
    
    public void borrow(int n) {
        assert(n > 0) : "Valore non valido!";
        booksBorrowed += n;
    }
    
    public void returnBooks(int n) {
        assert(n > 0) : "Valore non valido!";
        assert(n <= booksBorrowed) : "Errore: il numero di libri restituiti è superiore al numero di libri in prestito";
        booksBorrowed -= n;
    }
    
    public static int getNumAccounts() {
        return counter;
    }
}
