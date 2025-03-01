import java.util.HashMap;
import java.util.Map;

public class Fibonacci_Recursion {

    //private static long[] container;
    private static Map<Integer, Long> container = new HashMap<>();
    public static void main(String[] args) {

        int n = 100;
        //container = new long[n+1];
        //for (int i = 0; i < n+1; i++) {
        //    container[i] = -1;
        //}



        long startTime = System.currentTimeMillis();
        System.out.println(fib(n));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + "ms");
    }

    static long fib(int n) {
        if(n<2){
            return n;
        }

        //if(container[n]!=-1){
        //    return container[n];
        //}
        if(container.containsKey(n)){
            return container.get(n);
        }

        long result = fib(n-2)+fib(n-1);
        //container[n] = result;
        container.put(n, result);
        return result;
    }
}