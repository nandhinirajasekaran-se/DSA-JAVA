package DSA.Mathematics;

import java.util.Arrays;

public class ThreeDivisors {

    public static int divisor(int N){
        int count = 0;
        if(N<4)
            return count;
        else {
            for (int i = 5; i <= N; i += 2) {
                double fact = java.lang.Math.sqrt(i);
                if (fact % 1 == 0) {
                    System.out.println(fact + " " + i);
                }
                if (fact % 1 == 0 && prime((int) fact))
                    count++;
            }
        }
        return count+1;
    }
    public static boolean prime(int a) {
        if (a ==0 || a==1 ) {
            return false;
        }else if(a == 2 || a==3){
            return true;
        }else {
            if(a%2==0 || a%3==0){
                return false;
            }else{
                for(int i=5;i<=Math.sqrt(a);i+=2){
                    if(a%i==0){
                        return false;
                    }
                }
                return true;
            }
        }

    }
    public static void main(String[] args) {

        System.out.println("3 exact divisor: "+exactly3Divisors(10));
    }


    public static int exactly3Divisors(int n) {
        // Find all prime numbers up to sqrt(n) using Sieve of Eratosthenes
        int limit = (int) Math.sqrt(n);
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count numbers with exactly 3 divisors
        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i] && (long) i * i <= n) {
                count++;
            }
        }
        return count;
    }


}