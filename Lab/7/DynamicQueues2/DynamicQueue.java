package DynamicQueues2;

public class DynamicQueue {
    private Node head;
    private Node tail;

    public void enqueue(int elem) {
        if (head == null) {
            head = new Node(elem, null);
            tail = head;
        }
        else {
            Node newNode = new Node(elem, null);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public int dequeue() {
        if (head == null) {
            System.err.print("La coda e' vuota! ");
            return -1;
        }

        int elem = head.getElem();
        head = head.getNext();
        if (head == null) tail = null;
        
        return elem;
    }

    public boolean contains(int elem) {
        if (head == null) {
            System.err.println("La coda e' vuota");
            return false;
        }
        Node check = head;

        while (check != null) {
            if (check.getElem() == elem) return true;
            check = check.getNext();
        }

        return false;
    }

    public int front() {
        return head != null ? head.getElem() : -1;
    }
}
