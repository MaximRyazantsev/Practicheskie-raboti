public class Square extends Rectangle {
    public Square() {
        super(1, 1, "White", false);
    }

    public Square(double side) {
        super(side, side, "White", false);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void SetSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return this.length;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square: side - " + this.width + " Color/filled " + this.color + "/" + this.filled;
    }
}
