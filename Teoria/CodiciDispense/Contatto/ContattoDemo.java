package Contatto;

// ContattoDemo.java
public class ContattoDemo {
    // controllo i metodi della classe Contatto
    public static void main(String[] args) {
        Contatto a = new Contatto("a", "a@ditta");
        System.out.println("Contatto a: " + a);
        System.out.println("Modifico nome a in a2");
        a.setNome("a2");
        System.out.println("Contatto a modificato: " + a);
        System.out.println("Modifico email a in a2@ditta");
        a.setEmail("a2@ditta");
        System.out.println("Contatto a modificato: " + a);
        // il disegno si riferisce a questo punto della computazione
        String nomea = a.getNome();
        String emaila = a.getEmail();

        System.out.println(nomea.toString());
        System.out.println(emaila.toString());

        System.out.println(nomea);
        System.out.println(emaila);
    }
}
