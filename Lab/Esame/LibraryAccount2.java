package Esame;

public class LibraryAccount2 {
    static int counter = 0;
    private int id;
    private String memberName;
    private int booksBorrowed;
    
    public LibraryAccount2(String memberName, int booksBorrowed) {
        if(memberName == null || booksBorrowed < 0) {
            System.out.println("Valori non ammessi");
            return;
        }
        counter++;
        id = counter;
        this.memberName = memberName;
        this.booksBorrowed = booksBorrowed;
    }
    
    public LibraryAccount2(String memberName) {
        if(memberName == null) {
            System.out.println("Valore non ammessi");
            return;
        }

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
        if(n <= 0)  
            System.out.println("Valore non valido!");
        else
            booksBorrowed += n;
    }
    
    public void returnBooks(int n) {
        if(n <= 0) 
            System.out.println("Valore non valido!");
        else if(n > booksBorrowed)
            System.out.println("Errore: il numero di libri restituiti è superiore al numero di libri in prestito");
        else
            booksBorrowed -= n;
    }
    
    public static int getNumAccounts() {
        return counter;
    }
}
