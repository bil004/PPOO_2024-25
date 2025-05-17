package Triangle;

public class MutableTriangle {
    private MutablePoint a, b, c;

    public MutableTriangle (MutablePoint a, MutablePoint b, MutablePoint c) {
        assert (a != null) && (b != null) && (c != null) : "I punti sono nulli!";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MutablePoint getA() {
        return a;
    }

    public MutablePoint getB() {
        return b;
    }

    public MutablePoint getC() {
        return c;
    }
    
    public void translate(double dx, double dy) {
        a.translate(dx, dy);
        b.translate(dx, dy);
        c.translate(dx, dy);
    }

    public double perimeter() {
        return a.distance(b) + a.distance(c) + b.distance(c);
    }
}
