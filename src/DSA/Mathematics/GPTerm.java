package DSA.Mathematics;

public class GPTerm {

    public static double termOfGP(int A,int B,int N)
    {
        double r = (double) B/A;
        double nthTerm = A*power(r,N-1);
        return java.lang.Math.floor(nthTerm);
    }

    public static double power(double r, int N){
        double result = 1.0;
        while(N > 0){
            if(N%2 == 1){
                result *= r;
            }
            r *= r;
            N /= 2;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println("Nth term: "+termOfGP(84,87,3));
    }



}