package DSA.TwoPointers;

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t){
        return buildChr(s).equals(buildChr(t));
    }

    public String buildChr(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()){
            if(ch!='#'){
                System.out.println(ch);
                stack.push(ch);
            }else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        System.out.println(String.valueOf(stack));
        return String.valueOf(stack);
    }
    public static void main(String[] args) {

        BackspaceCompare backspaceCompare = new BackspaceCompare();
        System.out.println(backspaceCompare.backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare.backspaceCompare("ab##","c#d#"));

    }
}
