public class Ball {
    private int r;
    private String color;
    private String material;
    public Ball () {
        this(0, "NONE", "NONE");
    }
    public Ball (int r) {
        this(r, "NONE", "NONE");
    }
    public Ball (String color, String material) {
        this(0, color, material);
    }
    public Ball (int r, String color, String material) {
        this.r = r;
        this.color = color;
        this.material = material;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String toString() {
        return "Ball: " + this.color +" " + this.material + " R: " + this.r;
    }
}