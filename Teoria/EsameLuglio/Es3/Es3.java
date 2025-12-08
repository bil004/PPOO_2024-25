package Teoria.EsameLuglio.Es3;

public class Es3 {
    public static void main(String[] args) {
        Tree t = new Leaf();
        t = t.insert(3);
        t = t.insert(1);
        t = t.insert(4);
        t = t.insert(2);

        System.out.println("Albero prima della rimozione di 3:");
        System.out.println(t); // stampa ricorsiva

        t = t.remove(3);

        System.out.println("CHECK POINT 2");

        System.out.println("Albero dopo la rimozione di 3:");
        System.out.println(t); // stampa ricorsiva
    }
}
