public class Head {
    private double mass;
    private double height;
    private double girth;
    public Head (double _mass, double _height, double _girth){
        mass=_mass;
        height=_height;
        girth=_girth;
    }
    public void setMass(double mass) {this.mass = mass;}
    public void setHeight(double height) {this.height = height;}
    public void setGirth(double girth) {this.girth = girth;}
    public double getMass() {return mass;}
    public double getHeight() {return height;}
    public double getGirth() {return girth;}
    @Override
    public String toString() {
        return "Head{" +
                "mass=" + mass +
                ", height=" + height +
                ", girth=" + girth +
                '}';
    }
}