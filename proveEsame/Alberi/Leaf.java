package Alberi;

public class Leaf extends Tree{
    public boolean isEmpty() {
        return true;
    }

    public int max() {
        return 0;
    }
    
    public int size() {
        return 0;
    }

    public boolean contains(int elem) {
        return false;
    }

    public Tree insert(int elem) {
        return new Branch(this, elem, this);
    }

    public Tree remove(int elem) {
        return this;
    }

    protected String toStringAux(String prefix, String root, String left, String right) {
        return prefix + root + "leaf";
    }
}