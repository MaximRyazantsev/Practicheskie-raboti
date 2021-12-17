public class TestDog {
    public static void main(String[] args) {
        GermanShepherd d1 = new GermanShepherd(5, 'M', 60.25, 100.5, 35,  "black", "brown");
        GermanBoxer d2 = new GermanBoxer(6, 'W', 55, 70, 25, true);
        System.out.println(d1);
        System.out.println(d2);
    }
}