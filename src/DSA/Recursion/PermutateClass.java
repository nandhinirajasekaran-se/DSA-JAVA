package DSA.Recursion;

public class PermutateClass {

    public static void permute(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        }
        for (int i = l; i <= r; i++) {
            str= swap(str, i, l);
            permute(str, l + 1, r);
            str= swap(str, i, l);
        }
    }
    public static String swap(String input, int l, int r) {

        char temp = input.charAt(l);
        char[] chars = input.toCharArray();
        chars[l] = chars[r];
        chars[r] = temp;
        return String.valueOf(chars);
    }
    public static void main(String[] args){
        PermutateClass perm = new PermutateClass();
        perm.permute("ABC",0,2);
    }
}
