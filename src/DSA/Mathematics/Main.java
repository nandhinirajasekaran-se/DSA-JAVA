package DSA.Mathematics;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int n=88;
        int digits =0;

        while(n>0){
           if(n>0){
               n=n/10;
               System.out.println(n);
               digits++;
           }
        }

        System.out.println("digits = " + digits);
    }

}