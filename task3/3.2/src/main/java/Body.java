public class Body {
    private double mass;
    private double height;
    private double chestGirth;
    private double hipGirth;
    private double waistGrith;

    public Body(double _mass, double _height, double _chestGirth, double _hipGirth, double _waistGrith) {
        mass = _mass;
        height = _height;
        chestGirth = _chestGirth;
        hipGirth = _hipGirth;
        waistGrith = _waistGrith;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setChestGirth(double chestGirth) {
        this.chestGirth = chestGirth;
    }

    public void setHipGirth(double hipGirth) {
        this.hipGirth = hipGirth;
    }

    public void setWaistGrith(double waistGrith) {
        this.waistGrith = waistGrith;
    }

    public double getMass() {
        return mass;
    }

    public double getHeight() {
        return height;
    }

    public double getChestGirth() {
        return chestGirth;
    }

    public double getHipGirth() {
        return hipGirth;
    }

    public double getWaistGrith() {
        return waistGrith;
    }

    @Override
    public String toString() {
        return "Body{" +
                "mass=" + mass +
                ", height=" + height +
                ", chestGirth=" + chestGirth +
                ", hipGirth=" + hipGirth +
                ", waistGrith=" + waistGrith +
                '}';
    }
}
