import java.util.Scanner;

public class Ex5 {
    public static int rec(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return n % 10 + rec(n / 10);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(rec(n));
    }
}
