package DSA.Mathematics;

public class AllFactors {
    public static  void allFactors(int a) {
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a=a/i;
                if(i!=a){
                    System.out.print(a + " ");
                    System.out.println(" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("All Factors ");
        allFactors(16);
    }
}