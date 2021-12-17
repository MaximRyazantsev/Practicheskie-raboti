public class NameableTest {
    public static void main(String[] args) {
        Student s = new Student("Viktor");
        Pet p = new Pet("Baloo");
        Planet pl = new Planet("Earth");
        System.out.println(s.getName());
        System.out.println(p.getName());
        System.out.println(pl.getName());
    }
}