package practise;

import static DSA.Mathematics.Factorial.factorial;

public class Factorial {
    public static int factorial_recursive(int n){
        if (n==0 ||n==1){
            return n;
        }
        return n * Factorial.factorial_recursive(n-1);
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));

    }
}
