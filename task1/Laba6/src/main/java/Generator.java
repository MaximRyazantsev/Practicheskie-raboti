import java.util.Arrays;
import java.util.Random;

public class Generator {

    public  void mathRand() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            double d = Math.random();
            array[i] =  (int) (d * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        array = Arrays.stream(array).sorted().toArray();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

    }

    public void randomClass() {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] =  random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        array = Arrays.stream(array).sorted().toArray();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }


}
