package Es1;

public class Matita {
    public static final int minStelo = 10, maxStelo = 200, maxPunta = 5;
    private int stelo, punta;
    
    public Matita (int stelo) {
        assert (stelo <= maxStelo);
        this.stelo = stelo;
        punta = maxPunta;
    }

    public int getPunta() {
        return punta;
    }

    public int getStelo() {
        return stelo;
    }

    public Boolean disegna() {
        if (punta < 1) return false;
        punta--;
        return true;
    }

    public Boolean tempera() {
        if (stelo == 0 || punta == maxPunta) return false;
        stelo--;
        punta++; 
        return true;
    }
}