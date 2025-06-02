package DSA.Mathematics;

public class GCF {
    public static int gcf(int a,int b) {
        if(b == 0) return a;
        else return gcf(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcf(12,16));
    }

}