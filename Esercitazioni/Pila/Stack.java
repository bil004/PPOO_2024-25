package Pila;

public class Stack<T extends Comparable<T>>{
    private Node<T> head;
    private int size = 0;

    public void push(T elem) {
        if (head == null) {
            head = new Node<T>(elem, null);
        }
        else {
            head = new Node<T>(elem, head);
        }
        size++;
    }

    public T pop() {
        if (head == null) return null;
        T e = head.getElem();
        head = head.getNext();
        size--;
        return e;
    }
    
    public T max() {
        if (head == null) return null;
        Node<T> search = head;
        T max = search.getElem();
        search = search.getNext();

        while (search != null) {
            if (search.getElem().compareTo(max) > 0) 
                max = search.getElem();

            search = search.getNext();
        }
        return max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(T elem) {
        Node<T> search = head;

        while (search != null) {
            if (search.getElem().equals(elem))
                return true;
            search = search.getNext();
        }
        
        return false;
    }

    public T peek() {
        return head != null? head.getElem() : null;
    }

    @Override
    public String toString() {
        Node<T> n = head;
        String s = null;

        while (n != null) {
            if (s == null)
                s = "[" + n.getElem() + "]\n";
            else 
                s += "[" + n.getElem() + "]\n";
            
            n = n.getNext();
        }
        return s;
    }
}
