package Extends;

public class DynamicStackSizeDemo {
    public static void main(String[] args) {
        System.out.println("Definisco la pila P = {-1}");
        DynamicStackSize p = new DynamicStackSize();
        p.push(-1);
        System.out.println(p);
        
        System.out.println("Definisco la pila p = {11, 9, 7, 5, 3, 1, -1}");
        p.push(1);
        p.push(3);
        p.push(5);
        p.push(7);
        p.push(9);
        p.push(11);
        System.out.println(p);

        System.out.println("Estraggo 11, 9, 7. Leggo 5");
        System.out.println(" p.pop() = " + p.pop());
        System.out.println(" p.pop() = " + p.pop());
        System.out.println(" p.pop() = " + p.pop());
        
        /* Leggiamo il prossimo elemento, 5, senza estrarlo dalla pila
           con top() */
        System.out.println(" p.top() = " + p.top());
        System.out.println("Stampo cio' che resta: p = {5, 3, 1, -1}");
        System.out.println(p);
    }
}