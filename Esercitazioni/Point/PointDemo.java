package Point;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5), p2 = new Point(1, 2);
        PointI i1 = new PointI(2.5, 3.5), i2 = new PointI(1, 2);

        System.out.println("MUTUABLE POINT\n");
        System.out.println("Coordinate di p1\nX: " + p1.getX() + "\tY: " + p1.getY());
        System.out.println("\nCoordinate di p2\nX: " + p2.getX() + "\tY: " + p2.getY());

        System.out.println("");
        p1.distance(p2);

        System.out.println("");
        p2.distance(p1);

        System.out.println("");
        System.out.println("Sposto p1 di 2 e -7...");

        p1.traslate(2, -7);
        System.out.println("");
        System.out.println("Punto spostato! Nuove coordinate di p1\nX: " + p1.getX() + "\tY: " + p1.getY());

        System.out.println("\n-----------------------------------------------------------");
        System.out.println("IMMUTUABLE POINT\n");

        System.out.println("Coordinate di i1\nX: " + i1.getX() + "\tY: " + i1.getY());
        System.out.println("\nCoordinate di i2\nX: " + i2.getX() + "\tY: " + i2.getY());

        System.out.println("");
        PointI diff1 = i1.distance(i2);
        System.out.println("Differenza i1 - i2: X: " + diff1.getX() + "\tY: " + diff1.getY());

        System.out.println("");
        PointI diff2 = i2.distance(i1);
        System.out.println("Differenza i2 - i1: X: " + diff2.getX() + "\tY: " + diff2.getY());

        System.out.println("");
        System.out.println("Sposto i1 di 2 e -7...");
        PointI i1Moved = i1.traslate(2, -7);
        System.out.println("");
        System.out.println("Nuove coordinate di i1 spostato\nX: " + i1Moved.getX() + "\tY: " + i1Moved.getY());
        System.out.println("Coordinate originali di i1 (immutabile)\nX: " + i1.getX() + "\tY: " + i1.getY());
    }
}
