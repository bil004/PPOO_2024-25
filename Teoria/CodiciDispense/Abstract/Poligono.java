package Abstract;

// Poligono.java. 

/**
 * Sottoclasse astratta di Figura:
 * anche se classe figlia di Figura, non ha dei metodi implementati per
 * calcolare area e perimetro, pur avendo degli attributi e un metodo di lettura
 * per il numero dei lati.
 */

public abstract class Poligono extends Figura {
    protected int lati; // INVARIANTE: lati>=3
    /*
     * "protected" consente di modificare "lati" nelle sottoclassi di Poligono (in
     * particolare, ci serve per i poligoni regolari)
     */

    public Poligono(int lati) {
        // Non e' necessario invocare il costruttore della classe superiore quando e' il
        // costruttore di default, quindi possiamo omettere:
        // super();
        assert lati >= 3; // per mantenere l’invariante
        this.lati = lati;
    }

    public int getLati() {
        return lati;
    }
    // In alcune sottoclassi il numero dei lati puo' cambiare
    // ma in altre no, quindi in questa classe niente metodo set()

    public static void main(String[] args) {
        // Posso dichiarare variabili di tipo Poligono:
        Poligono p;
        // Poligono t = new Poligono(3);
        // NON corretto, Poligono è una classe astratta
        /**
         * NON posso creare oggetti di tipo Poligono con new Poligono(), ma potrei
         * assegnare a p un oggetto di una sottoclasse concreta di Poligono, oppure
         * null. ATTENZIONE: il valore di default di p non è null. Infatti se si prova a
         * stampare p con una println() subito dopo la sua dichiarazione il compilatore
         * ci dice che la variabile p non è stata inizializzata.
         */
    }
}