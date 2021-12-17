import java.util.Scanner;

public class Ex11 {
    public static int recursion() {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        if (number.equals("00")) {
            return 0;
        } else {
            if (number.equals("1")) {
                return 1 + recursion();
            } else {
                return recursion();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
