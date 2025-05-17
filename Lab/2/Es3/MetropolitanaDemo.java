package Es3;

public class MetropolitanaDemo {
    public static void main(String[] args) {
        Metropolitana m1 = new Metropolitana("123", 1, 8);
        Metropolitana m2 = new Metropolitana("321", 1, 5);

        System.out.println("\nBefore\n");
        System.out.println("Mat: " + m1.getMat() + "\tLine: " + m1.getLine() + "\t\tStation: " + m1.getStation());
        System.out.println("Mat: " + m2.getMat() + "\tLine: " + m2.getLine() + "\t\tStation: " + m2.getStation());

        for (int i = 0; i < 2; i++) {
            m1.aggiornaProssimaStazione();
            m2.aggiornaProssimaStazione();
        }

        System.out.println("\nAfter\n");
        System.out.println("Mat: " + m1.getMat() + "\tLine: " + m1.getLine() + "\t\tStation: " + m1.getStation());
        System.out.println("Mat: " + m2.getMat() + "\tLine: " + m2.getLine() + "\t\tStation: " + m2.getStation());
        System.out.println();
    }
}
