public class PriceableTest {
    public static void main(String[] args) {
        Order s = new Order(500);
        Book p = new Book(100);
        Dish pl = new Dish(300);
        System.out.println(s.getPrice());
        System.out.println(p.getPrice());
        System.out.println(pl.getPrice());
    }
}