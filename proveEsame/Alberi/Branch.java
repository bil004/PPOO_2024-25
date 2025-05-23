package Alberi;

public class Branch extends Tree {
    private Tree left;
    private int elem;
    private Tree right;

    public Branch(Tree left, int elem, Tree right) {
        this.left = left;
        this.elem = elem;
        this.right = right;
    }

    public boolean isEmpty() {
        return false;
    }

    public int max() {
        return right.isEmpty() ? elem : right.max();
    }

    public int size() {
        return 1 + right.size() + left.size();
    }

    public boolean contains(int elem) {
        if (this.elem == elem) 
            return true;

        if (elem > this.elem)
            return left.contains(elem);
        else
            return right.contains(elem);
    }

    public Tree insert(int elem) {
        if (this.elem < elem)
            left = left.insert(elem);
        else if (this.elem > elem)
            right = right.insert(elem);
        
        return this;
    }

    public Tree remove(int elem) {
        if (this.elem == elem) {
            if (left.isEmpty())
                return right;
            
            if (right.isEmpty()) 
                return left;
        }
        
        if (this.elem < elem) {
            left = left.remove(elem);
            return this;
        }

        // L'elemento da rimuovere si trova a destra
        right = right.remove(elem);
        return this;
    }

    // Metodo che gestisce la parte NON pubblica della conversione in String. Non
    // forniamo spiegazioni sul suo funzionamento, non e' essenziale.
    protected String toStringAux(String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, "   /", "   ", "  ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, "   \\", "  ¦", "   ");
    }
}
