public class Three {

    public int CounterFor(int[] p){
        int sum = 0;
        for (int i = 0; i < p.length; i++){
            sum += p[i];
        }
        return sum;
    }

    public int CounterWhile(int[] p){
        int sum = 0;
        int i = 0;
        while (i < p.length){
            sum += p[i];
            i++;
        }
        return sum;
    }

    public int CounterDoWhile(int[] p){
        int sum = 0;
        int i = 0;
        do {
            sum += p[i];
            i++;
        }
        while (i < p.length);
        return sum;
    }

}
