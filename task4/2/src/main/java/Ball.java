public class Ball {
    private double x;
    private double y;
    private double s = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        x = 0.0;
        y = 0.0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x = xDisp * s;
        y = yDisp * s;
    }

    public void setXYspeed(double speed) {
        s = speed;
    }

    public String toString() {
        return "Ball @ (" + x + ", " + y + ", " + s + ")";
    }
}
