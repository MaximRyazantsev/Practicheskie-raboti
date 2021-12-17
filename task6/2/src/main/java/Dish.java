public class Dish implements Priceable {
    private int price;

    public Dish() {
    }

    public Dish(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price='" + price + '\'' +
                '}';
    }
}
