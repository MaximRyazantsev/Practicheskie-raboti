public class Hand {
    private double mass;
    private double length;

    public Hand(double _mass, double _length) {
        mass = _mass;
        length = _length;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMass() {
        return mass;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "mass=" + mass +
                ", length=" + length +
                '}';
    }
}
