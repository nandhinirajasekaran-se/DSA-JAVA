package practise;

public class PalindromeCheck {
    public static boolean isPalindrome(int num){
        int reversed = 0;
        while (num>0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num /= 10;
        }
        System.out.println(reversed);
        return reversed==num;
    }
    public static void main(String[] args){
        String str = "malayalam";
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // remove non-alphanumeric
        String reversed = new StringBuffer(cleaned).reverse().toString();
        System.out.println(reversed.equals(str)? "True":"False");
        System.out.println(isPalindrome(131));

    }
}
