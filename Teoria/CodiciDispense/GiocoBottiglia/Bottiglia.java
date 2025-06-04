package GiocoBottiglia;

//Bottiglia.java
/* Versione con: uso assert, con this omesso ove possibile, con 
metodi get() e set(). Per evitare modifiche alla capacita' non forniamo 
un metodo set per la capacita'. */

public class Bottiglia { // Nota: quantita' intere espresse in galloni
    private int capacita; // 0 <= capacita
    private int livello; // 0 <= livello <= capacita

    /*
     * 0 <= capacita AND 0 <= livello <= capacita
     * rappresenta un INVARIANTE di classe, ovvero una proprietà che definisce la
     * buona formazione degli oggetti della classe Bottiglia: questa proprietà deve
     * essere mantenuta vera dopo l’esecuzione del costruttore e dei metodi che
     * manipolano gli oggetti di tipo Bottiglia.
     */

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        /**
         * "this.capacita" e' un attributo di bottiglia mentre "capacita" e' l'unico
         * argomento del costruttore Bottiglia
         */
        livello = 0;
        assert (0 <= livello) && (livello <= capacita);
        // per assicurare che l'oggetto sia ben formato
    }

    /*
     * Tutti i metodi che seguono sono dinamici (non-static), quindi hanno tutti un
     * parametro 'this', oltre ai parametri espliciti elencati entro le loro
     * parentesi (...). Il 'this' prende come valore l'indirizzo dell'oggetto su cui
     * viene chiamato il metodo. Ricordiamo che la parola-chiave this può essere
     * lasciata implicita ovunque non si creino ambiguità.
     * Un esercizio che si può fare è individuare in quali punti c'è il this
     * implicito (e dove quindi si potrebbe rendere esplicito).
     */

    /**
     * Aggiungiamo tutta la parte di una quantita' data che trova posto nella
     * bottiglia (dunque il minimo tra la quantita' data e la capacita' residua).
     * Restituiamo la quantita` che abbiamo aggiunto (che puo' essere meno della
     * richiesta).
     */
    public int aggiungi(int quantita) {
        assert quantita >= 0 : "la quantita' doveva essere >=0 invece vale " + quantita;
        int aggiunta = Math.min(quantita, capacita - livello);
        livello = livello + aggiunta;
        assert (0 <= livello) && (livello <= capacita);
        // dopo l'esecuzione del metodo l'oggetto deve essere ancora
        // ben formato <-- RISPETTIAMO L'INVARIANTE DI CLASSE STABILITO
        return aggiunta;
        /**
         * min e' un metodo statico della classe Math, quindi fuori dalla classe Math lo
         * indico con Math.min
         */
    }

    /**
     * Rimuoviamo da una bottiglia una quantita' richiesta se c'e', altrimenti
     * togliamo tutto (dunque il minimo tra la quantita' richiesta e il livello).
     * Restituiamo la quantita' rimossa (che puo' essere meno della richiesta)
     */

    public int rimuovi(int quantita) {
        assert quantita >= 0 : "la quantita' doveva essere >=0 invece vale " + quantita;
        int rimossa = Math.min(quantita, livello);
        livello = livello - rimossa;
        assert (0 <= livello) && (livello <= capacita);
        // dopo l'esecuzione del metodo l'oggetto deve essere ancora
        // ben formato <-- RISPETTIAMO L'INVARIANTE DI CLASSE STABILITO
        return rimossa;
    }

    public int getCapacita() {
        return this.capacita;
    }

    public int getLivello() {
        return this.livello;
    }

    // Non consentiamo di cambiare la capacita', quindi non c'è
    // un metodo setCapacita()

    public void setLivello(int livello) {
        /**
         * "this.livello" e' un attributo di bottiglia mentre "livello" e' l'unico
         * argomento del metodo setLivello()
         */
        // assert sul parametro:
        assert (0 <= livello) && (livello <= capacita)
                : "il valore del livello da impostare nella bottiglia deve essere >=0 e contemporaneamente non superiore alla capacita` della bottiglia";
        this.livello = livello;
        // assert sul campo:
        assert (0 <= this.livello) && (this.livello <= capacita);
    }
    
    // conversione oggetto bottiglia --> stringa
    public String toString() {
        return livello + "/" + capacita;
    }
}