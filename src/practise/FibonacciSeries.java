package practise;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n){
       if(n<=1) return n;
       if(memo.containsKey(n)) return memo.get(n);
       int value = fib(n-1)+fib(n-2);
       memo.put(n,value);
       return value;
    }

    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void fiboItr(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args){
        System.out.println("Fibonacci Series of N:");
        for (int i=0;i<10;i++){
            System.out.print(fibo(i) + " ");
        }

        System.out.println("\nFibonacci Iterative Series of N:");
        fiboItr(10);

        System.out.println("\nFibonacci Dynamic programming Series");
        for (int i=0;i<10;i++)
            System.out.print(fib(i) + " ");
    }
}
