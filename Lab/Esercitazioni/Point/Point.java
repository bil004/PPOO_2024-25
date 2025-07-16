package Point;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void traslate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void distance(Point p) {
        if (p == null || !(p instanceof Point)) return;
        System.out.println("Distanza:\nX = " + (p.x - this.x) + "\tY = " + (p.y - this.y));
    }
}
