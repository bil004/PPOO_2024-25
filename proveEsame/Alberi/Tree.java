package Alberi;

public abstract class Tree {
    public abstract Tree insert(int elem);
    public abstract Tree remove(int elem);
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract int max();
    public abstract boolean contains(int elem);
    protected abstract String toStringAux(String prefix, String root, String left, String right);

    public String toString() {
        return toStringAux("", "___", "   ", "   ");
    }
}   