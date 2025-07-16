package List;

public class ListDemo {
    public static void main(String[] args) {
        List l = new List();
        System.out.println("Lista vuota? " + l.isEmpty());
        System.out.println("Size: " + l.size());

        // Test insert
        System.out.println("Inserisco 5: " + l.insert(5)); // true
        System.out.println("Inserisco 10: " + l.insert(10)); // true
        System.out.println("Inserisco 5 (duplicato): " + l.insert(5)); // false
        System.out.println("Size: " + l.size()); // 2

        // Test contains
        System.out.println("Contiene 5? " + l.contains(5)); // true
        System.out.println("Contiene 7? " + l.contains(7)); // false

        // Test remove
        System.out.println("Rimuovo 5: " + l.remove(5)); // true
        System.out.println("Rimuovo 7 (non presente): " + l.remove(7)); // false
        System.out.println("Rimuovo 10: " + l.remove(10)); // true
        System.out.println("Lista vuota? " + l.isEmpty()); // true
        System.out.println("Size: " + l.size()); // 0
    }
}
