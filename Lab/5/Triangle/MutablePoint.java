package Triangle;

public class MutablePoint {
    private double x, y;

    public MutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // distanza Euclidea tra questo punto e il punto p
    public double distance(MutablePoint p) {
        assert p != null;
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    /*public void distance(MutablePoint p) {
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