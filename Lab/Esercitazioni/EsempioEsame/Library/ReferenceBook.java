package Library;

public class ReferenceBook extends LibraryBook{
    @Override
    public void borrow() {
        System.out.println("Impossibile effettuare il prestito!");
    }
}
