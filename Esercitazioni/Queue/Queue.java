package Queue;

public class Queue<T>{
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public void enqueue(T elem) {
        if (head == null) {
            head = new Node<>(elem, null);
            tail = head;
        } else {
            Node<T> newElem = new Node<>(elem, null);
            tail.setNext(newElem);
            tail = newElem;
        }
        size++;
    }
    
    public T dequeue() {
        if (head.equals(null)) {
            System.out.println("Coda vuota!");
            return null;
        }

        T ret = head.getElem();
        head = head.getNext();
        if (head == null) 
            tail = null;
        
        size--;
        return ret;
    }

    public boolean contains(T elem) {
        Node<T> check = head;
        while(check != null) {
            if (check.getElem().equals(elem))
                return true;
            
            check = check.getNext();
        }   
        return false;
    }

    public int getSize() {
        return size;
    }

    public T front() {
        return head != null? head.getElem() : null;
    }

    public boolean empty() {
        return size == 0;
    }
    
}
