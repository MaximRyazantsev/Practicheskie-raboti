public class Book implements Priceable {
    private int price;

    public Book() {
    }

    public Book(int price) {
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
        return "Book{" +
                "price='" + price + '\'' +
                '}';
    }
}
