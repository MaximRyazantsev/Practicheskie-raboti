public class Order implements Priceable {
    private int price;

    public Order() {
    }

    public Order(int price) {
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
        return "Order{" +
                "price='" + price + '\'' +
                '}';
    }
}
