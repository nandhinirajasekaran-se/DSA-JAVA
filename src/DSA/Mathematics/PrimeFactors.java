package DSA.Mathematics;

public class PrimeFactors {
    public static  void primeFactors(int a) {
        if(a<=1)
            return;
        else{
            if (a%2==0) {
                checkPrimeFactors(a,2);
            }
            if (a%3==0) {
                checkPrimeFactors(a,3);
            }
            for(int i=5;i*i<=a;i++){
                checkPrimeFactors(a,i);
            }
        }
    }

    public static int checkPrimeFactors(int a, int i) {
        while (a%i==0){
            System.out.println(i+" ");
            a=a/i;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Prime Factors ");
        primeFactors(24);
    }


}