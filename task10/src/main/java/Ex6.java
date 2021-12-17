import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
public class Ex6 {
    public static long gcd (long a, long b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
    public static boolean ferma(long x){
        if(x == 2)
            return true;
        Random  random = new Random();
        for(int i=0;i<100;i++){
            long a = (random.nextLong() % (x - 2)) + 2;
            if (gcd(a, x) != 1)
                return false;
            if( (long)Math.pow(a, x-1) % x != 1)
                return false;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(ferma(n));
    }
}
