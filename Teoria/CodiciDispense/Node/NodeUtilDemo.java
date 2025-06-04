package Node;
//Applicazione di prova: NodeUtilDemo.java

public class NodeUtilDemo {
    public static void main(String[] args) {
        System.out.println("Main di prova per gli esercizi 0-7");
        System.out.println("---------------------");

        // creo una lista concatenata con i nodi di q = {10,20,30,40}: si deve partire
        // da 40 per inserire ogni volta in testa alla lista il nuovo nodo creato
        Node q = new Node(40, null);
        q = new Node(30, q);
        q = new Node(20, q);
        q = new Node(10, q);
        System.out.println("Lista q:");
        /*
         * Poiché scriviOutput() è un metodo statico di NodeUtil
         * dobbiamo invocarlo indicato il nome della classe
         */
        NodeUtil.scriviOutput(q);
        System.out.println("---------------------");

        // creo una lista concatenata con i nodi di p={10,20,30,40,30,20,10}: si deve
        // partire da 10
        Node p = new Node(10, null);
        p = new Node(20, p);
        p = new Node(30, p);
        p = new Node(40, p);
        p = new Node(30, p);
        p = new Node(20, p);
        p = new Node(10, p);
        System.out.println("Lista p:");
        NodeUtil.scriviOutput(p);

        System.out.println("---------------------");
        System.out.println("1. length(p) = " + NodeUtil.length(p));
        System.out.println("1. length_rec(p) = " + NodeUtil.length_rec(p));
        System.out.println("---------------------");
        System.out.println("2. sum(p) = " + NodeUtil.sum(p));
        System.out.println("2. sum_rec(p) = " + NodeUtil.sum_rec(p));
        System.out.println("---------------------");
        System.out.println("3. max(p) = " + NodeUtil.max(p));
        System.out.println("3. max_rec(p) = " + NodeUtil.max_rec(p));
        System.out.println("---------------------");
        System.out.println("4. member(p,30) = " + NodeUtil.member(p, 30));
        System.out.println("4. member(p,50) = " + NodeUtil.member(p, 50));
        System.out.println("4. member_rec(p,30) = " + NodeUtil.member_rec(p, 30));
        System.out.println("4. member_rec(p,50) = " + NodeUtil.member_rec(p, 50));
        System.out.println("---------------------");
        System.out.println("5. toString(q) = " + NodeUtil.toString(q));
        System.out.println("5. toString(p) = " + NodeUtil.toString(p));
        System.out.println("---------------------");
        System.out.println("6. sorted(q) = " + NodeUtil.sorted(q));
        System.out.println("6. sorted(p) = " + NodeUtil.sorted(p));
        System.out.println("---------------------");
        System.out.println("7. equals(p, q) = " + NodeUtil.equals(p, q));
        System.out.println("7. equals(p, p) = " + NodeUtil.equals(p, p));
        System.out.println("7. equals(q, q) = " + NodeUtil.equals(q, q));
        System.out.println("7. equals(q, p) = " + NodeUtil.equals(q, p));
    }
}