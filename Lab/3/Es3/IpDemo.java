package Es3;

public class IpDemo {
    public static void main(String[] args) {
        ImmutuablePoint p1 = new ImmutuablePoint(2.5, 3.5), p2 = new ImmutuablePoint(1, 2);
        
        System.out.println("Coordinate di p1\nX: " + p1.getX() + "\tY: " + p1.getY());
        System.out.println("\nCoordinate di p2\nX: " + p2.getX() + "\tY: " + p2.getY());

        System.out.println("");
        p1.distance(p2);

        System.out.println("");
        p2.distance(p1);

        System.out.println("");
        System.out.println("Sposto p1 di 2 e -7...");

        ImmutuablePoint pMoved = p1.move(2, -7);
        System.out.println("");
        System.out.println("Punto creato! Vecchie coordinate di p1\nX: " + p1.getX() + "\tY: " + p1.getY());
        System.out.println("Nuove coordinate di p1(pMoved)\nX: " + pMoved.getX() + "\tY: " + pMoved.getY());
    }
}
