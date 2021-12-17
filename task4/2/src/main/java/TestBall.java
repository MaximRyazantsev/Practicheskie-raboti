import java.lang.*;

public class TestBall {
    public static void main(String[] args){
        Ball ball1 = new Ball(200, 150);
        System.out.println(ball1);
        ball1.setXYspeed(5);
        ball1.move(100,20);
        System.out.println(ball1);
    }
}