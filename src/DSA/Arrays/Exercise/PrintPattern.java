package DSA.Arrays.Exercise;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    public static void main(String[] args){
        System.out.println(printPattern(16));
        System.out.println(printPattern(15));
    }

    private static List<Integer> printPattern(int N) {
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(int i=N;i>0;i-=5){
            list.add(count,i);
            list.add(count++,i);
            if(i-5<0 || i-5==0){
                list.add(count,i-5);
            }
        }
        return list;
    }
}
