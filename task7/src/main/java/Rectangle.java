public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super("White", false);
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        super("White", false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: length - " + this.length + " width - " + this.width + " " + this.color + " " + this.filled;
    }
}
