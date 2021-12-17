public class Leg {
    private double mass;
    private double length;

    public Leg(double _mass, double _length) {
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
        return "Leg{" +
                "mass=" + mass +
                ", length=" + length +
                '}';
    }
}
