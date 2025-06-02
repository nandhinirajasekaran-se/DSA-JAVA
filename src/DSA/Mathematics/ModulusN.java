package DSA.Mathematics;

public class ModulusN {

    public static long modulus(long a, long b) {
        long mod = 1000000007;
        return  ((( a%mod ) + ( b%mod )) % mod);
    }

    public static long modulusMul(long a, long b) {
        long mod = 1000000007;
        return  ((( a%mod ) * ( b%mod )) % mod);
    }

    public static void main(String[] args) {
        System.out.println(modulusMul(8279685334796349382l,3890369874501826197l));
    }

}
