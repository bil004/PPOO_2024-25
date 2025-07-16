package Teoria.EsameLuglio.Es1;

public class Lista {
    public static <T extends Comparable<T>> int countAux(Node<T> p, T v) {
        if (p == null) return 0;
        
        T x = p.getElem();
        if (x.compareTo(v) == 0) 
            return 1 + countAux(p.getNext(), v);

        return countAux(p.getNext(), v);
    }

    public static <T extends Comparable<T>> Node<Integer> count(Node<T> p, T v) {
        if (p == null || v == null) 
            return new Node<>(0, null);
        
        int c = countAux(p, v);
        return new Node<>(c, null);
    }

    public static void main(String[] args) {
        // Test con lista di interi: 1 -> 2 -> 3 -> 2 -> null
        Node<Integer> n4 = new Node<>(2, null);
        Node<Integer> n3 = new Node<>(3, n4);
        Node<Integer> n2 = new Node<>(2, n3);
        Node<Integer> n1 = new Node<>(1, n2);
        Node<Integer> head = n1;
        System.out.println("Lista: 1 -> 2 -> 3 -> 2 -> null");
        System.out.println("count(head, 2): " + count(head, 2)); // atteso: 2
        System.out.println("count(head, 3): " + count(head, 3)); // atteso: 1
        System.out.println("count(head, 4): " + count(head, 4)); // atteso: 0

        // Test con lista di stringhe: "a" -> "b" -> "a" -> null
        Node<String> s3 = new Node<>("a", null);
        Node<String> s2 = new Node<>("b", s3);
        Node<String> s1 = new Node<>("a", s2);
        Node<String> shead = s1;
        System.out.println("Lista: a -> b -> a -> null");
        System.out.println("count(shead, \"a\"): " + count(shead, "a")); // atteso: 2
        System.out.println("count(shead, \"b\"): " + count(shead, "b")); // atteso: 1
        System.out.println("count(shead, \"c\"): " + count(shead, "c")); // atteso: 0
    }
}
