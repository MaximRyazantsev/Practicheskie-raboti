import java.text.DecimalFormat;

public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle(10,10,30);
        System.out.println("circle1"+circle1);
        Circle circle2 = new Circle();
        circle2.setX(10);
        circle2.setY(5);
        circle2.setRadius(50);
        System.out.println("circle2"+circle2);
    }
}