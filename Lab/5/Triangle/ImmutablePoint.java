package Triangle;

public class ImmutablePoint {
    private double x, y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImmutablePoint translate(double dx, double dy) {
        return new ImmutablePoint(x + dx, y + dy);
    }

    // distanza Euclidea tra questo punto e il punto p
    public double distance(ImmutablePoint p) {
        assert p != null;
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    /* 
    public void distance(ImmutablePoint p) {
        if (p.equals(null)) return;

        double xMax = Math.max(x, p.x);
        double yMax = Math.max(y, p.y);

        if (xMax == x && yMax == y)
            System.out.println("Distanza dall'asse X: " + (x-p.x) + "\tDistanza dall'asse Y: " + (y-p.y));
        else
            System.out.println("Distanza dall'asse X: " + (p.x-x) + "\tDistanza dall'asse Y: " + (p.y-y));
    }
    */ 
}