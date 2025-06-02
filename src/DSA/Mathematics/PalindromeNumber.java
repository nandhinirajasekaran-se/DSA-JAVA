package DSA.Mathematics;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 188,temp = 188;
        int rev = 0;

        while(temp > 0){
            rev = (rev*10) + temp % 10;
            temp = temp / 10;
        }

        String ans = (rev==n) ? "true" :  "false";
        System.out.println("rev = " + rev);
        System.out.println("is the number Palindrome = " + ans );
    }

}