package DSA.Recursion;

public class GenSubSets {

    public static void genSubSets(String str, int index, String curr) {
        int n = str.length();
        if (index == n) {
            System.out.println(curr);
            return;
        }

        genSubSets(str, index + 1, curr+ str.charAt(index));
        genSubSets(str, index + 1, curr);

    }
    public static void main(String[] args) {

        String str = "abc";
        genSubSets(str, 0, "");
    }
}
