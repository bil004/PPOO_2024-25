package DynamicQueuesGen;

public class GenericDynamicQueue<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void enqueue(T elem) {
        if (head == null) {
            head = new Node<>(elem, null);
            tail = head;
        }
        else {
            Node<T> newNode = new Node<>(elem, null);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
            System.err.print("La coda e' vuota! ");
            return null;
        }

        T elem = head.getElem();
        head = head.getNext();
        if (head == null) tail = null;
        
        size--;
        
        return elem;
    }

    public boolean contains(T elem) {
        if (head == null) {
            System.err.println("La coda e' vuota");
            return false;
        }
        Node<T> check = head;

        while (check != null) {
            T cmp = check.getElem();
            if (cmp.equals(elem)) 
                return true;
            
            check = check.getNext();
        }

        return false;
    }

    public int size() {
        return size;
    }

    public T front() {
        return head != null ? head.getElem() : null;
    }

    public boolean empty() {
        return size == 0;
    }
}