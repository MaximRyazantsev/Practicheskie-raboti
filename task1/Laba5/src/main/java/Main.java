import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        numeric();
        fractional();
    }


    public static void fractional(){
        System.out.print(1 + " ");
        for (int i = 2; i < 11; i++) {
            System.out.print("1/" + i + " ");
        }
        System.out.println("\n");
    }

    public static void numeric(){
        for (int i = 1; i < 11; i++) {
            System.out.print(1./i + " ");
        }
        System.out.println("\n");
    }

}
