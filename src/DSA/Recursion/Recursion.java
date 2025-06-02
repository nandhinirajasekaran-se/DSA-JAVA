package DSA.Recursion;

public class Recursion {
    public static void printInOrder(int n) {
        if(n == 0) return;
        else{
            printInOrder(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        printInOrder(3);
    }

}