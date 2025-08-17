package practise;

import java.util.Map;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if (n==1) return false;
        if (n ==2 ) return true;
        if( n%2 ==0) return false;

        for(int i=3;i<= Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void printPrime(int limit){
        for(int i=0;i<limit;i++){
            if(isPrime(i))
                System.out.print(i+ " ");
        }
    }
    public static void main(String[] args){
        int n=29;
        System.out.println(n+ " is prime ? "+isPrime(n));
        printPrime(50);
    }
}
