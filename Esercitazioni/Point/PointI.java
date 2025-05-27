package Point;

public class PointI {
    private double x;
    private double y;

    public PointI(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public PointI traslate(double dx, double dy) {
        return new PointI(x + dx, y + dy);
    }

    public PointI distance(PointI p) {
        if (p == null || !(p instanceof PointI)) return null;
        return new PointI(p.x-this.x, p.y-this.y);
    }
}
