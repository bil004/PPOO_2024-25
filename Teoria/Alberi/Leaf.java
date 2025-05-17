package Alberi;

//Leaf.java - I suoi oggetti rappresentano alberi vuoti 

// Implementazione della classe Leaf per rappresentare alberi vuoti. I metodi definiti in Leaf restituiscono risultati costanti (che non dipendono dall’albero).

public class Leaf extends Tree {
    public Leaf() {
    }
    // Si noti che nella classe Leaf non ci sono attributi, poiché un nodo che
    // rappresenta un albero vuoto non contiene nessun valore e non ha nessun
    // sottoalbero. Il costruttore di Leaf perciò non inizializza nulla e si
    // potrebbe anche lasciare implicito. Un oggetto di questa classe è quindi
    // soltanto un segna-posto, che serve a indicare i nodi terminali di un albero,
    // ovvero un albero vuoto.
    // Ribadiamo che in questa rappresentazione NON si usa null per indicare un
    // albero vuoto, bensì proprio un oggetto di classe Leaf, in modo da sfruttare
    // il più possibile il binding dinamico nei metodi. Un albero viene
    // inizializzato vuoto con new Leaf() e poi esteso un elemento alla volta. Qui
    // this = oggetto istanziato = albero vuoto (che non e’ null). */

    public boolean empty() {
        return true;
    }
    // l'albero vuoto e' vuoto

    public int max() {
        assert false;
        return 0;
    }
    // l'albero vuoto non ha massimo, e' sbagliato chiederlo. Tuttavia Java richiede
    // un return se c'e' un tipo di ritorno, per questo scriviamo return 0;

    public boolean contains(int x) {
        return false;
    }
    // l'albero vuoto non contiene nulla

    public Tree insert(int x) {
        return new Branch(x, this, this);
    }
    // se inserisco x ottengo l'albero di radice x e nessun figlio; in questa classe
    // this è un oggetto di tipo Leaf: lo riuso, quindi non creo alberi vuoti nuovi.

    public Tree remove(int x) {
        return this;
    }
    // non c'e' nulla da cancellare nell'albero vuoto, quindi non cambia nulla

    // Metodo che gestisce la parte NON pubblica della conversione a String. Non
    // forniamo spiegazioni sul suo funzionamento. Notiamo solo che, come
    // rappresentazione in stringa di caratteri, utilizza il nome "leaf" che abbiamo
    // scelto di dare all’albero vuoto.
    protected String toStringAux(String prefix, String root, String left, String right) {
        return prefix + root + "leaf";
    }
}