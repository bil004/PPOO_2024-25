package Es3;

public class MpDemo {
    public static void main(String[] args) {
        MutuablePoint p1 = new MutuablePoint(2.5, 3.5), p2 = new MutuablePoint(1, 2);
        
        System.out.println("Coordinate di p1\nX: " + p1.getX() + "\tY: " + p1.getY());
        System.out.println("\nCoordinate di p2\nX: " + p2.getX() + "\tY: " + p2.getY());

        System.out.println("");
        p1.distance(p2);

        System.out.println("");
        p2.distance(p1);

        System.out.println("");
        System.out.println("Sposto p1 di 2 e -7...");

        p1.move(2, -7);
        System.out.println("");
        System.out.println("Punto spostato! Nuove coordinate di p1\nX: " + p1.getX() + "\tY: " + p1.getY());
    }
}
