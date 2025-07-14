package Teoria.Esame.Es3;

class Leaf extends Tree {
    @Override
    public String toStringAux(String prefix, String root, String left, String right) {
        return prefix + root + "{}";
    }

    public boolean empty() {
        return true;
    }

    public int max() {
        assert false; // Should not be called on an empty tree/leaf in a meaningful way
        return 0; // Or throw an exception for clarity
    }

    public Tree insert(int elem) {
        return new Branch(elem, new Leaf(), new Leaf());
    }

    public Tree remove(int elem) {
        return this; // Removing from a leaf does nothing, it remains a leaf
    }

    @Override
    public String toString() {
        return "{}";
    }
}
