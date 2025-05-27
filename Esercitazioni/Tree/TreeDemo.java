package Tree;

import java.util.Random;

public class TreeDemo {
    public static void main(String[] args) {
        // Crea una foglia vuota
        Tree t = new Leaf();
        Random rnd = new Random();
        
        // Inserisce 10 numeri casuali tra 1 e 100
        for (int i = 0; i < 10; i++) {
            int n = rnd.nextInt(100) + 1;
            t = t.insert(n);
            System.out.println("Inserito: " + n);
        }
        
        // Stampa la dimensione dell'albero
        System.out.println("\nDimensione albero: " + t.size());
        
        // Stampa se contiene il numero 50
        System.out.println("Contiene 50? " + t.contains(50));
        
        // Stampa l'altezza di un albero
        System.out.println("Altezza: " + t.height());
        
        // Stampa la rappresentazione dell'albero (se implementato)
        System.out.println("\nStampa struttura albero:");
        System.out.println(t.toStringAux("", "", "", ""));
    }
}
