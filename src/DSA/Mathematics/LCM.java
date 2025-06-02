package DSA.Mathematics;

public class LCM {
    public static int gcf(int a,int b) {
        if(b == 0) return a;
        else return gcf(b,a%b);
    }
    public static int lcm(int a,int b) {
        return (a*b)/gcf(a,b);
    }
    public static void main(String[] args) {
        System.out.println(lcm(12,16));
    }

}