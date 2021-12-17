public abstract class Furniture {
    protected String company;
    protected int cost;
    protected String color;
    protected String materialFrame;

    public Furniture() {
        this("NONE", "White", 0, "NONE");
    }

    public Furniture(String company, String color, int cost, String materialFrame) {
        this.company = company;
        this.color = color;
        this.cost = cost;
        this.materialFrame = materialFrame;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setMaterialFrame(String materialFrame) {
        this.materialFrame = materialFrame;
    }

    public String getMaterialFrame() {
        return materialFrame;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public abstract void Construct();

    public abstract void Transfer();

    public abstract void DeConstruct();

    @Override
    public String toString() {
        return " " + this.company + " " + this.color + " " + this.materialFrame + " " + this.cost;
    }
}
