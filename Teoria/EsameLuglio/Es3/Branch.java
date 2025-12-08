

public class Branch extends Tree {
    private int elem;
    private Tree left;
    private Tree right;

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public int getElem() {
        return elem;
    }

    public boolean empty() {
        return false;
    }

    public int max() {
        return right.empty() ? elem : right.max();
    }

    public Tree insert(int elem) {
        if (elem < this.elem) {
            left = left.insert(elem);
        } else { // elem >= this.elem, assuming no duplicates or adding to right for duplicates
            right = right.insert(elem);
        }
        return this;
    }

    public Tree remove(int elem) {
        if (elem == this.elem) {
            if (left.empty()) {
                return right;
            } else if (right.empty()) {
                return left;
            } else {
                // Node has two children: find in-order predecessor (max in left subtree)
                int maxInLeft = left.max();
                System.out.println("CHECK POINT 1"); // Prima volta che l'esecuzione raggiunge CHECK POINT 1
                this.elem = maxInLeft; // Replace current node's element with predecessor
                // Remove the predecessor from the left subtree
                // Assuming the intent was to remove maxInLeft, not the original 'elem' again
                left = left.remove(maxInLeft);
                return this;
            }
        } else if (elem < this.elem) {
            left = left.remove(elem);
        } else { // elem > this.elem
            right = right.remove(elem);
        }
        return this;
    }

    // Stampa ricorsiva ad albero con indentazione
    @Override
    public String toStringAux(String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, "   /", "   ", "  ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, " \\", "  ¦", "   ");
    }

    @Override
    public String toString() {
        return "{" + elem + "," + left.toString() + "," + right.toString() + "}";
    }
}