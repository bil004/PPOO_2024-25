package Es2;

public class Elicottero {
    private int x, y, Altitude;
    private int speed, verticalSpeed;
    private double track;

    public Elicottero(int x, int y, int Altitude) {
        this.x = x;
        this.y = y;
        this.Altitude = Altitude;
    }

    public int getAltitude() {
        return Altitude;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public double getTrack() {
        return track;
    }

    public int getVerticalSpeed() {
        return verticalSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setVerticalSpeed(int verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
    }

    public void setTrack(double track) {
        this.track = track;
    }

    public void elapse(double time) {
        // Calculate the change in position
        double deltaX = speed * time * Math.cos(Math.toRadians(track));
        double deltaY = speed * time * Math.sin(Math.toRadians(track));
        double deltaAltitude = verticalSpeed * time;
    
        // Update the position and altitude
        x += (int) deltaX;
        y += (int) deltaY;
        Altitude += (int) deltaAltitude;
    }
}
