package Generics;

// GenericNode.java
public class GenericNode<T> {
    private T elem;         // T -> elemento generico (char, int, float, object...)
    private GenericNode<T> next;

    public GenericNode(T elem, GenericNode<T> next) {
        this.elem = elem;
        this.next = next;
    }

    public T getElem() {
        return elem;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}
