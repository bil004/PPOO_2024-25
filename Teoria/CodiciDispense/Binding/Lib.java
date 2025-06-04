package Binding;

//Lib.java
public class Lib {
    public static void prova(Bottiglia b) {
        BottigliaConTappo c = (BottigliaConTappo) b;
        // si deve fare questo cast e non usare b direttamente sennò si riceve il
        // seguente errore di compilazione. Infatti, il tipo apparente di b è Bottiglia
        // che non contiene apri():
        /*
         * error: cannot find symbol
         * b.apri();
         * ^
         * symbol: method apri()
         * location: variable b of type Bottiglia
         */
        c.apri();
        int liv = c.aggiungi(1);
    }
}