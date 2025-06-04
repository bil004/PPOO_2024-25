package Abstract;
//Figura.java

/** LA CLASSE ASTRATTA FIGURA */
public abstract class Figura {

    /**
     * METODI ASTRATTI per area e perimetro: si possono usare solo quando vengono
     * sovrascritti in una sottoclasse
     */
    public abstract double area();

    public abstract double perimetro();

    public static void main(String[] args) {
        // Posso dichiarare variabili di tipo Figura:
        Figura p; // OK
        /**
         * Però NON posso creare oggetti di tipo Figura con new Figura(). Invece, potrei
         * assegnare a p un oggetto di una sottoclasse concreta di Figura, oppure null.
         * ATTENZIONE: il valore di default di p non è null. Infatti se si prova a
         * stampare p con una println() subito dopo la sua dichiarazione il compilatore
         * ci dice che la variabile p non è stata inizializzata.
         */

    }
}