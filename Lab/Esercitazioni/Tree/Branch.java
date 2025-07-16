package Tree;

public class Branch extends Tree {
    private Tree left;
    private int elem;
    private Tree right;

    public Branch(Tree left, int elem, Tree right) {
        this.left = left;
        this.elem = elem;
        this.right = right;
    }

    @Override
    public int size() {
        return 1 + left.size() + right.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int max() {
        return right.isEmpty() ? elem : right.max();
    }

    @Override
    public boolean contains(int elem) {
        if (elem == this.elem)
            return true;

        if (elem < this.elem)
            return left.contains(elem);
        else
            return right.contains(elem);
    }

    @Override
    public Tree insert(int elem) {
        if (elem < this.elem)
            left = left.insert(elem);
        else
            right = right.insert(elem);

        return this;
    }

    @Override
    public Tree remove(int elem) {
        if (elem == this.elem) {
            if (left.isEmpty())
                return right;
            else if (right.isEmpty())
                return left;
            else {
                this.elem = left.max();
                left = left.remove(this.elem);
                return this;
            }
        }

        if (elem < this.elem) {
            left = left.remove(elem);
            return this;
        }

        right = right.remove(elem);
        return this;
    }

    @Override
    protected int height() {
        return 1 + Math.max(left.height(), right.height());
    }

    @Override
    protected String toStringAux(String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, "   /", "   ", "  ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, "   \\", "  ¦", "   ");
    }
}
