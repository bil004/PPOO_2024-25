package Rubrica;

//RubricaDemo.java
public class RubricaDemo {
    public static void main(String[] args) {
        // Consentiamo 3 elementi in rubrica e proviamo a inserirne 4
        Rubrica r = new Rubrica(3);
        System.out.println("(1) Rubrica con contatti a,b,c:");
        r.aggiungi("a", "a@ditta");
        r.aggiungi("b", "b@ditta");
        r.aggiungi("c", "c@ditta");
        r.aggiungi("d", "d@ditta");
        System.out.println(r);
        // vengono stampati a,b,c: l'aggiunta di d e' fallita
        System.out.println("e-mail di c=" + r.cercaEmail("c"));
        System.out.println("(2) Rimuovo a");
        r.rimuovi("a");
        System.out.println(r);
        System.out.println("(3) Aggiungo b (ma c'e' gia'): successo = "
                + r.aggiungi("b", "e"));
        System.out.println(r);
        System.out.println("(4) Modifico b in b2: successo = "
                + r.cambiaNome("b", "b2"));
        System.out.println(r);
        System.out.println("(5) Modifico b@ditta in b2@ditta: successo = " + r.cambiaEmail("b2", "b2@ditta"));
        System.out.println(r);
    }
}