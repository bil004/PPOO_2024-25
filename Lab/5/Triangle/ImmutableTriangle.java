package Triangle;

public class ImmutableTriangle {
    private ImmutablePoint a, b, c;

    public ImmutableTriangle (ImmutablePoint a, ImmutablePoint b, ImmutablePoint c) {
        assert (a != null) && (b != null) && (c != null) : "I punti sono nulli!";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ImmutablePoint getA() {
        return a;
    }

    public ImmutablePoint getB() {
        return b;
    }

    public ImmutablePoint getC() {
        return c;
    }
    
    public ImmutableTriangle translate(double dx, double dy) {
        return new ImmutableTriangle(a.translate(dx, dy), b.translate(dx, dy), c.translate(dx, dy));
    }

    public double perimeter() {
        return a.distance(b) + a.distance(c) + b.distance(c);
    }
}
