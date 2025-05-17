package Triangle;

public class TriangleDemo {
    public static void main(String[] args) {
        MutableTriangle mt = new MutableTriangle(new MutablePoint(1, 1), new MutablePoint(2, 2),
                new MutablePoint(1, 2));
        System.out.println("Vertices of (mutable) triangle are:");
        System.out.println("(" + mt.getA().getX() + ", " + mt.getA().getY() + ")");
        System.out.println("(" + mt.getB().getX() + ", " + mt.getB().getY() + ")");
        System.out.println("(" + mt.getC().getX() + ", " + mt.getC().getY() + ")");

        mt.translate(0, 2);
        System.out.println("After modification, vertices of (mutable) triangle are:");
        System.out.println("(" + mt.getA().getX() + ", " + mt.getA().getY() + ")");
        System.out.println("(" + mt.getB().getX() + ", " + mt.getB().getY() + ")");
        System.out.println("(" + mt.getC().getX() + ", " + mt.getC().getY() + ")");

        System.out.println("Perimeter: " + mt.perimeter());

        ImmutableTriangle it = new ImmutableTriangle(new ImmutablePoint(1, 1), new ImmutablePoint(2, 2),
                new ImmutablePoint(1, 2));
        System.out.println("Vertices of (immutable) triangle are:");
        System.out.println("(" + it.getA().getX() + ", " + it.getA().getY() + ")");
        System.out.println("(" + it.getB().getX() + ", " + it.getB().getY() + ")");
        System.out.println("(" + it.getC().getX() + ", " + it.getC().getY() + ")");

        ImmutableTriangle newIt = it.translate(0, 2);
        System.out.println("After modification, vertices of (immutable) triangle are:");
        System.out.println("(" + newIt.getA().getX() + ", " + newIt.getA().getY() + ")");
        System.out.println("(" + newIt.getB().getX() + ", " + newIt.getB().getY() + ")");
        System.out.println("(" + newIt.getC().getX() + ", " + newIt.getC().getY() + ")");

        System.out.println("Perimeter: " + newIt.perimeter());

        mt.getA().translate(-1, 0);
        System.out.println("After \"security leak\" modification, vertices of (mutable) triangle are:");
        System.out.println("(" + mt.getA().getX() + ", " + mt.getA().getY() + ")");
        System.out.println("(" + mt.getB().getX() + ", " + mt.getB().getY() + ")");
        System.out.println("(" + mt.getC().getX() + ", " + mt.getC().getY() + ")");

    }
}
