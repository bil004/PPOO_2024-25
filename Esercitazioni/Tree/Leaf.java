package Tree;

// foglia, albero vuoto (non ha radici)

public class Leaf extends Tree {
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int max() {
        assert false;
        return 0;
    }

    @Override
    public boolean contains(int elem) {
        return false;
    }

    @Override
    public Tree insert(int elem) {
        return new Branch(this, elem, this);
    }

    @Override
    public Tree remove(int elem) {
        return this;
    }

    @Override
    protected int height() {
        return 0;
    }

    @Override
    protected String toStringAux(String prefix, String root, String left, String right) {
        return "";
    }
}
