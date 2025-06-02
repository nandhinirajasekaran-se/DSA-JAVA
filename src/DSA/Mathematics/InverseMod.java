package DSA.Mathematics;

public class InverseMod {

    public static void main(String[] args) {

        System.out.println("inverseMod: "+inverseMod(2,1));
    }


    public static int inverseMod(int a,int m) {

        if(m==1)
            return -1;
        // Find all prime numbers up to sqrt(n) using Sieve of Eratosthenes
        int gcd[] = gcdExtend(a,m);
        int gcd1= gcd[0];
        int x= gcd[1];

        if(gcd1 !=1 )
            return -1;

        return ( x%m + m) % m;
    }

        public static int[] gcdExtend(int a, int m){
            if(m==0){
                return new int[]{a,1,0};
            }

            int vals[] = gcdExtend(m,a%m);
            int gcd = vals[0];
            int x1 = vals[2];
            int x2 = vals[1]- (a/m)*vals[2];

            return new int[]{ gcd,x1,x2};

        }


}