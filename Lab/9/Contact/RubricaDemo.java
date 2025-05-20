package Contact;

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
        System.out.println("(2) Rimuovo il contatto \"a\"");
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

        // MY STUFF

        System.out.println("(6) Aggiungo ad: successo = " + r.aggiungi("ad", "ad@com"));
        System.out.println(r);
        System.out.println("(7) Aggiungo bd: successo = " + r.aggiungi("bd", "bd@com"));
        System.out.println(r);
        System.out.println("(8) Aggiungo cd: successo = " + r.aggiungi("cd", "cd@com"));
        System.out.println(r);
        System.out.println("(9) Aggiungo dd: successo = " + r.aggiungi("cd", "cd@com"));
        System.out.println(r);
        System.out.println("(10) Rimuovo cd");
        r.rimuovi("cd");
        System.out.println(r);
        System.out.println("(11) Modifico bd in dddd: successo = " + r.cambiaNome("bd", "dddd"));
        System.out.println(r);

        // TEST ORDINAMENTO
        System.out.println("\n(12) Test ordinamento rubrica:");
        Rubrica r2 = new Rubrica(5);
        r2.aggiungi("Luca", "luca@email.it");
        r2.aggiungi("Mario", "mario@email.it");
        r2.aggiungi("Anna", "anna@email.it");
        r2.aggiungi("Giulia", "giulia@email.it");
        r2.aggiungi("Carlo", "carlo@email.it");
        System.out.println("Rubrica prima di sort():\n" + r2);
        r2.sort();
        System.out.println("Rubrica dopo sort():\n" + r2);
    }
}