package Teoria.Esame.Es3;

public abstract class Tree {
    abstract public boolean empty();
    abstract public int max();
    abstract public Tree insert(int elem);
    abstract public Tree remove(int elem);

    protected abstract String toStringAux(String prefix, String root, String left, String right);

    @Override
    public String toString() {
        return toStringAux("", "___", " ", " ");
    }
}
