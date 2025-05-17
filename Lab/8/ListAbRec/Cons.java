package ListAbRec;

public class Cons extends List {
    private int elem;
    private List next;
    // private Cons next;

    public Cons(int elem, List next) {
        this.elem = elem;
        this.next = next;
    }

    public boolean empty() {
        return false;
    }

    public int size() {
        return 1 + next.size();
    }

    public boolean contains(int x) {
        return x == elem || next.contains(x);
    }
    // contains(x) chiama ricorsivamente se stesso se next e'
    // in Cons, chiama il metodo contains(x) di Nil se next e' in Nil

    /**
     * Insert. Metodo che aggiunge x, costruisce una nuova lista
     * riutilizzando this se possibile, e preserva l'ordine crescente
     */
    public List insert(int x) {
        // Se x piu' piccolo del primo elem aggiungo x davanti a tutti:
        if (x < elem)
            return new Cons(x, this);
        // Se x uguale al primo elem lascio this come si trova
        else if (x == elem)
            return this;
        // Se x maggiore del primo elemento aggiungo x nel resto della
        // lista
        else // in questo caso x > elem
            return new Cons(elem, next.insert(x));
    }
    // Il metodo insert(x) chiama ricorsivamente se stesso se next e'
    // in Cons, chiama il metodo insert(x) su Nil se next e' in Nil

    /**
     * Append. Aggiunge una lista l a this, costruendo una nuova
     * lista e preservando l'ordine crescente. Usiamo insert per
     * aggiungere il contenuto di l un elemento alla volta
     * preservando l'ordine ad ogni passo.
     */
    public List append(List l) {
        if (l.empty())
            return this;// questo test non e' strettamente
        // necessario, ma rende la computazione piu' efficiente
        else
            return next.append(l).insert(elem);
    }

    /**
     * Calcola la somma di tutti gli elementi della lista.
     */
    public int sum() {
        return elem + next.sum();
    }

    /**
     * Restituisce l'elemento in una posizione specifica.
     */
    public int get(int index) {
        if (index == 0) {
            return elem;
        } else {
            return next.get(index - 1);
        }
    }

    /**
     * Restituisce una nuova lista con ogni elemento incrementato di 1.
     */
    public List succ() {
        return new Cons(elem + 1, next.succ());
    }

    /**
     * Restituisce una sottolista con elementi minori o uguali a x.
     */
    public List filter_le(int x) {
        if (elem <= x) {
            return new Cons(elem, next.filter_le(x));
        } else {
            return next.filter_le(x);
        }
    }

    /**
     * Restituisce una sottolista con elementi maggiori di x.
     */
    public List filter_gt(int x) {
        if (elem > x) {
            return new Cons(elem, next.filter_gt(x));
        } else {
            return next.filter_gt(x);
        }
    }

    /**
     * Restituisce una lista contenente l'intersezione tra this e l.
     */
    public List intersect(List l) {
        if (l.contains(elem)) {
            return new Cons(elem, next.intersect(l));
        } else {
            return next.intersect(l);
        }
    }

    public String toString() {
        return elem + " " + next.toString();
    }

}
