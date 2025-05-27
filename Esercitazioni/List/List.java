package List;

public class List {
    private Node head;
    private int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public boolean insert(int elem) {
        Node n = new Node();
        n.setElem(elem);
        n.setNext(null);
        if (isEmpty()) {
            head = n;
            size++;
            return true;
        }
        Node put = head;
        
        while (true) {
            if (put.getElem() == elem)
                return false;
            
            if (put.getNext() == null) {
                put.setNext(n);
                size++;
                return true;
            }
            put = put.getNext();
        }
    }

    public boolean remove(int elem) {
        if (isEmpty()) return false;
        
        if (head.getElem() == elem) {
            head = head.getNext();
            size--;
            return true;
        }

        Node prev = head;
        Node cur = prev.getNext();

        while (cur != null) {
            if (cur.getElem() == elem) {
                prev.setNext(cur.getNext());
                size--;
                return true;
            }
            prev = cur;
            cur = cur.getNext();
        }
        return false;
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

    public int size() {
        return size;
    }
}
