package Movie;

public class Documentary extends Movie{
    public Documentary(String titolo, int durata) {
        super(titolo, durata);
    }
    
    @Override
    public void play() {
        System.out.println("Il documentario " + super.getTitolo() + " dalla durata di " + super.getDurata() + " è in riproduzione!");    
    }
}
