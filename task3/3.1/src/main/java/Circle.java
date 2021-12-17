public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " {" +
                "x=" + x + ", " +
                "y=" + y + ", " +
                "radius=" + radius + ", " +
                "S=" + getArea() + ", " +
                "P=" + getPerimeter() + '}';
    }
}
