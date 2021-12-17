public abstract class Dish {
    protected String color;
    protected int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String usedFor();

    @Override
    public String toString() {
        return color + price;
    }
}
