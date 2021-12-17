import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Three three = new Three();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++){
            array[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(three.CounterWhile(array));
        System.out.println(three.CounterFor(array));
        System.out.println(three.CounterDoWhile(array));
    }
}
