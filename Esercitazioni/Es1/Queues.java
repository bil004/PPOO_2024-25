package Es1;

public class Queues {
    private Node head, tail;
    private int size = 0;
    
    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(Node n) {
        if (n == null) return;

        if(head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = tail.getNext();
        }
        size++;
    }

    public int dequeue() {
        if (head == null) return Integer.MIN_VALUE;

        int elem = head.getElem();
        head = head.getNext();

        if (head == null) 
            tail = null;
        
        size--;

        return elem;
    }

    public boolean empty() {
        return size == 0;
    }

    public boolean contains(int elem) {
        Node check = head;

        while (check != null) {
            if (check.getElem() == elem)
                return true;

            check = check.getNext();
        }

        return false;
    }

    public boolean equals(Queues q1, Queues q2) {
        if (q1.getSize() != q2.getSize()) return false;

        Node check1 = q1.getHead(), check2 = q2.getHead();
        while (check1 != null) {
            if (check1.getElem() != check2.getElem())
                return false;
            
            check1 = check1.getNext();
            check2 = check2.getNext();
        }

        return true;
    }

    public int front() {
        return head != null ? head.getElem() : Integer.MIN_VALUE;
    }

    public int sum(Node head) {
        if (head == null) return 0;
        return head.getElem() + sum(head.getNext());
    }
}
