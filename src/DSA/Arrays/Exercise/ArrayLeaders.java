package DSA.Arrays.Exercise;

import java.util.ArrayList;

public class ArrayLeaders {

    public static void main(String[] args){
        System.out.println(arrayLeaders(new int[]{16, 17, 4, 3, 5, 2}));
        System.out.println(arrayLeaders(new int[]{5, 10, 20, 40}));
        System.out.println(arrayLeaders(new int[]{30, 10, 10, 5}));
    }

    private static ArrayList<Integer> arrayLeaders(int[] ints) {
        ArrayList<Integer> arr = new ArrayList<>();
        int maxFromRight = ints[ints.length-1];
        arr.add(maxFromRight);
        for (int i=ints.length-2;i>=0;i--){
            if(ints[i] >= maxFromRight){
                maxFromRight = ints[i];
                arr.add(0,ints[i]);
            }
        }
        arr.reversed();
        return arr;
    }
}
