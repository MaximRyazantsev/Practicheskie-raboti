public class Cup extends Dish {
    protected String type;

    public Cup(String color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String usedFor() {
        return "Cup used for " + type;
    }

    @Override
    public String toString() {
        return "Cup " + type + " " + super.toString();
    }
}
