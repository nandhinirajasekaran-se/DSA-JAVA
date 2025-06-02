package DSA.Recursion;

public class Palindrome {
    public static boolean palindromeChk(String str, int i) {
        if(i > str.length()/2) return true;
        else{
            return str.charAt(i) == str.charAt(str.length()-1-i) && palindromeChk(str, i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(palindromeChk("test",0));
    }
}
