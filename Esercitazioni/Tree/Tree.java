package Tree;

public abstract class Tree {
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract int max();
    public abstract boolean contains(int elem);
    public abstract Tree insert(int elem);
    public abstract Tree remove(int elem);
    protected abstract String toStringAux(String prefix, String root, String left, String right);
    protected abstract int height();
    public String toString() {
        return toStringAux("", "___", "   ", "   ");
    }
}
