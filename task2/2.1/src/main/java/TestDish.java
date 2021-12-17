public class TestDish {
    public static void main(String[] args) {
        Cup cup = new Cup("red", 100, "tee");
        Plates plate = new Plates("green", 200, "cake");
        System.out.println(cup);
        System.out.println(plate);
        System.out.println(cup.usedFor());
        System.out.println(plate.usedFor());
    }
}