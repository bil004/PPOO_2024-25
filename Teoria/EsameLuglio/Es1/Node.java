package Teoria.EsameLuglio.Es1;

public class Node<T extends Comparable<T>> {
    private T elem;
    private Node<T> next;

    public Node(T elem, Node<T> next) {
        this.elem = elem;
        this.next = next;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public Node<T> getNext() {
        return next;
    }
}