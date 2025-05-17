package Es3;

public class ImmutuablePoint {
    private double x, y;
    
    public ImmutuablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImmutuablePoint move(double dx, double dy) {
        return new ImmutuablePoint(x + dx, y + dy);
    }

    public void distance(ImmutuablePoint p) {
        if (p.equals(null)) return;

        double xMax = Math.max(x, p.x);
        double yMax = Math.max(y, p.y);

        if (xMax == x && yMax == y)
            System.out.println("Distanza dall'asse X: " + (x-p.x) + "\tDistanza dall'asse Y: " + (y-p.y));
        else
            System.out.println("Distanza dall'asse X: " + (p.x-x) + "\tDistanza dall'asse Y: " + (p.y-y));
    }    
}