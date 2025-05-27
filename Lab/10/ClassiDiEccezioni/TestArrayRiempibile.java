package ClassiDiEccezioni;

import java.util.*;

public class TestArrayRiempibile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi dell'array: ");
        int l = in.nextInt();
        ArrayRiempibile a = new ArrayRiempibile(l);

        while (!a.controllarePieno()) {
            System.out.println("Inserisci una posizione e il valore corrispondente: ");
            int i = in.nextInt();
            int v = in.nextInt();
            a.inserire(i, v);
            System.out.println(a);
        }

        System.out.println("Somma elementi ArrayRiempibile: " + a.calcolareSomma());

        System.out.println("\nScrivo le info in un file");
        a.scrivereFile();
    }
}
