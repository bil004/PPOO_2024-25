package ListAbRec;

public abstract class List {
    public abstract boolean empty();
    public abstract int size();
    public abstract List insert(int x);
    public abstract List append(List l);
    public abstract boolean contains(int x);
    public abstract int sum();
    public abstract int get(int index);
    public abstract List succ();
    public abstract List filter_le(int x);
    public abstract List filter_gt(int x);
    public abstract List intersect(List l);
}
