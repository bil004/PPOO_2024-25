package GenericsPair;

// GenericPair.java

/*
 * Permette di creare oggetti "coppia di elementi (x,y)" di tipo rispettivamente
 * T e S, tipi non noti a priori. Sarà il codice client che al momento in cui
 * eseguiamo una new istanzierà le variabili di classe con delle classi (tipi)
 * specifiche.
 * Trovate degli esempi nel file TestGenericPair.java. La classe coppia viene
 * detta una classe parametrica, i suoi parametri sono i parametri di tipo T e
 * S. Si dice anche che è una classe polimorfa, perché può assumere più ruoli a
 * seconda della scelta di T e S, favorendo il riuso del codice.
 */

public class GenericPair<T, S> {
    private T first;
    private S second;
    // T, S parametri di tipo che rappresentano variabili di
    // classe (e dunque dei tipi)
    // T e S NON possono essere tipi primitivi
    // (limitazione solo apparente, viene superata introducendo
    // il concetto di "autoboxing" che vedremo tra poco)

    /* Dobbiamo chiamare il costruttore GenericPair, senza <T,S> */
    public GenericPair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    /*
     * Ricordiamo che un metodo toString() sta in qualsiasi classe T0, S0 quindi
     * puo' essere usato anche se non sappiamo, all'interno della classe
     * GenericPair, quali saranno i tipi di dati effettivi assegnati nel codice
     * client a T e S. Infatti, se le classi sostituite a T e S non definiscono il
     * toString(), per i campi first e second viene usato quella della classe
     * Object, che restituisce la stringa indirizzo-nella-heap in esadecimale, come
     * NomeClasse@548c4f57.
     */
    public String toString() {
        return "(" + first.toString() + "," + second.toString() + ")";
    }
}