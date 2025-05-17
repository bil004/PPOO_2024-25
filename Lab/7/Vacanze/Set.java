package Vacanze;

public class Set <T>{
    private Node<T> first;
    private int size;

    public Set() {
        this.first = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public boolean contains(T elem) {
        if (first == null) return false; 
        
        Node<T> check = first; 
        while (check != null) {
            if (elem.equals(check.getElem()))
                return true;
            
            check = check.getNext();
        }

        return false;
    }

    public void add(T elem) {
        if (contains(elem)) return;
    
        Node<T> newNode = new Node<>(elem, null);

        if (first == null) 
            first = newNode;
        else {
            Node<T> tmp = first;
            while (tmp.getNext() != null)
                tmp = tmp.getNext();
            
            tmp.setNext(newNode);
        }

        size++;
    }

    public boolean remove(T elem) {
        if (!contains(elem)) return false;

        if (first != null && first.getElem().equals(elem)) {
            first = first.getNext(); 
            size--; 
            return true;
        }

        Node<T> prev = null;
        Node<T> current = first;

        while (current != null && !current.getElem().equals(elem)) {
            prev = current;
            current = current.getNext();
        }

        if (current != null) {
            prev.setNext(current.getNext()); 
            size--; 
        }

        return true;
    }

    public boolean subsetOf(Set<T> s) {
        Node<T> current = first;
        while (current != null) {
            if (!s.contains(current.getElem())) {
                return false;
            }
            current = current.getNext();
        }
        return true;
    }

    public boolean equalsTo(Set<T> s) {
        return this.size == s.size && this.subsetOf(s);
    }

    public Set<T> union(Set<T> s) {
        Set<T> result = new Set<>();
        Node<T> current = first;

        while (current != null) {
            result.add(current.getElem());
            current = current.getNext();
        }

        current = s.first;
        while (current != null) {
            result.add(current.getElem());
            current = current.getNext();
        }

        return result;
    }

    public Set<T> intersection(Set<T> s) {
        Set<T> result = new Set<>();
        Node<T> current = first;

        while (current != null) {
            if (s.contains(current.getElem())) {
                result.add(current.getElem());
            }
            current = current.getNext();
        }

        return result;
    }
    
    public void print() {
        if (first == null) 
            System.out.println("La lista non esiste!");
        
        else if (size == 0) 
            System.out.println("Lista vuota!");
        
        else {
            Node<T> tmp = first;

            while (tmp != null) {
                System.out.print("[" + tmp.getElem() + "]->");
                tmp = tmp.getNext();
            }
            System.out.println("");
        }
    }
}