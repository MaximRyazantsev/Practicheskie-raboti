import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        System.out.println(factorial(i));
    }

    public static int factorial(int i){
        int c = 1;
        for (int j = 1; j <= i; j++){
            c *= j;
        }
        return c;
    }

}
