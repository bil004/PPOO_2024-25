package Animale;

// CoppiaAnimali.java
public class CoppiaAnimali {
    private Animale primo;
    private Animale secondo;

    /**
     * Un oggetto CoppiaAnimali dopo la sua dichiarazione ha come valori nei campi
     * primo=null, secondo=null.
     */

    public CoppiaAnimali(String n1, int e1, double p1, String n2, int e2, double p2) {
        /**
         * Si devono fare due "new" per ottenere oggetti diversi da null nei campi primo
         * e secondo, altrimenti scrivendo, per esempio, primo.setNome(n1); produrebbe a
         * run time una NullPointerException.
         */
        primo = new Animale(n1, e1, p1);
        secondo = new Animale(n2, e2, p2);
    }

    public Animale getPrimo() {
        return primo;
    }
    /*
     * Restituisce l’indirizzo del primo oggetto Animale. Pertanto, mette la classe
     * che invoca il metodo in condizioni di modificare i dati di primo
     * direttamente, accedendo ai campi dell’oggetto.
     */

    public Animale getSecondo() {
        return secondo;
    }
    /* idem come per getPrimo(). */

    /**
     * VERSIONE ALTERNATIVA DELLE get(), che previene il problema del Security Leak.
     * Se non vogliamo consentire di modificare gli attributi dei due animali
     * dall'esterno, i due metodi get() devono creare una copia o "clone" dei due
     * oggetti nei campi primo e secondo, in modo da non restituire l'indirizzo
     * originario, ma quello dei cloni. Restituire un clone significa restituire un
     * oggetto che ha nei propri campi valori uguali a quelli dell’oggetto
     * originale, ma è un’istanza differente di Animale.
     */

    // get() implementate come metodi di clonazione:
    /*
     * public Animale getPrimo()
     * {return new Animale(primo.getNome(), primo.getEta(),
     * primo.getPeso());}
     */

    /*
     * public Animale getSecondo()
     * {return new Animale(secondo.getNome(), secondo.getEta(),
     * secondo.getPeso());}
     */

    public String toString() {
        return primo.toString() + "\n--------\n" + secondo.toString();
    }
}