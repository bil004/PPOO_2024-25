package Binding;

// LibDemo.java
public class LibDemo {

    public static void main(String[] args) {

        System.out.println("** b1 **");
        BottigliaConTappo b1 = new BottigliaConTappo(9);
        System.out.println("** prima **");
        System.out.println(b1);
        Lib.prova(b1);
        System.out.println("** dopo **");
        System.out.println(b1);
        // Upcast: BottigliaConTappo <: Bottiglia, dove Bottiglia è il tipo apparente
        // del parametro b di Lib.prova(). Compila e non dà errori a runtime in
        // Lib.prova(), perché ha tipo vero BottigliaConTappo.

        System.out.println("** b2 **");
        Bottiglia b2 = new Bottiglia(2);
        System.out.println("** prima **");
        System.out.println(b2);
        Lib.prova(b2);
        System.out.println("** dopo **");
        System.out.println(b2);
        // Compila perché b2 ha tipo apparente Bottiglia, che è proprio il tipo del
          // paramentro di Lib.prova(), MA si ha il seguente errore a runtime nel metodo
          // Lib.prova(), all’istruzione ‘BottigliaConTappo c = (BottigliaConTappo)b;’:
        /*
         * Exception in thread "main" java.lang.ClassCastException: class Bottiglia
         * cannot be cast to class BottigliaConTappo (Bottiglia and BottigliaConTappo
         * are in unnamed module of loader 'app')
         * at Lib.prova(Lib.java:4)
         * at LibDemo.main(LibDemo.java:10)
         */
    }
}
