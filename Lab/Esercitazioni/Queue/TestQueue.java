package Queue;

import java.util.Random;

public class TestQueue {
    public static void main(String[] args) {
        Random r = new Random();
        Queue<Integer> q = new Queue<Integer>();

        q.enqueue(r.nextInt(11));
        q.enqueue(r.nextInt(11));
        q.enqueue(r.nextInt(11));
        q.enqueue(r.nextInt(11));
        q.enqueue(r.nextInt(11));
        q.enqueue(r.nextInt(11));

        System.out.println("Size: " + q.getSize());

        System.out.println("\nVerifico se contiene il numero 2: " + q.contains(2));

        System.out.println("\nElemento rimosso: " + q.dequeue());
        System.out.println("Elemento rimosso: " + q.dequeue());

        System.out.println("\nSize: " + q.getSize());

        System.out.println("Size: " + q.getSize());

        System.out.println("\nProcedo a rimuovere tutti i " + q.getSize() + " elementi dalla coda!");
        System.out.println("Elemento rimosso: " + q.dequeue());
        System.out.println("Elemento rimosso: " + q.dequeue());
        System.out.println("Elemento rimosso: " + q.dequeue());
        System.out.println("Elemento rimosso: " + q.dequeue());

        System.out.println("\nControllo se la lista è vuota: " + q.empty());
        System.out.println("Size: " + q.getSize());
    }
}

