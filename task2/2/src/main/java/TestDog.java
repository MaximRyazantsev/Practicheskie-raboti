public class TestDog {
    public static void main (String[] args) {
        Dog[] dogs = new Dog[4];
        dogs[0] = new Dog(5, "Name1");
        dogs[1] = new Dog(4, "Name2");
        dogs[2] = new Dog(3, "Name3");
        dogs[3] = new Dog(2, "Name4");
        System.out.println(dogs[0]);
        System.out.println(dogs[1].getAge());
        System.out.println(dogs[2].getName());
        System.out.println(dogs[3].getHumanAge());
    }
}