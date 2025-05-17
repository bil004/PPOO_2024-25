package DynamicStack;

//DynamicStackDemo.java (prova della classe DynamicStack)
public class DynamicStackDemo {
    public static void main(String[] args) {
        DynamicStack p = new DynamicStack();
        p.push(3);
        p.push(5);
        p.push(7);
        p.push(9);
        p.push(11);
        System.out.println("Stampo la pila p = {11,9,7,5,3}");
        System.out.println(p);
        System.out.println("Estraggo gli ultimi 3 elementi inseriti: 11, 9, 7. Leggo 5");
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        // Leggiamo il prossimo elemento, 5, senza estrarlo dalla pila
        System.out.println("\nLeggiamo il prossimo elemento, 5, senza estrarlo dalla pila");
        System.out.println(p.top());
        System.out.println("\nStampo cosa resta: p = {5,3}");
        System.out.println(p);
    }
}