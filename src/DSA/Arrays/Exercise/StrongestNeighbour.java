package DSA.Arrays.Exercise;

import java.util.*;

public class StrongestNeighbour {

    public static void main(String[] args){
        strongNeighbour(new int[]{1,2,2,3,4,5});strongNeighbour(new int[]{78,77,45});
    }

    private static void strongNeighbour(int[] ints) {

        for(int i=0;i<ints.length-1;i++){
            System.out.println(ints[i]+":"+ints[i+1]);
            ints[i]=Math.max(ints[i],ints[i+1]);
        }
        ints = Arrays.copyOf(ints,ints.length-1);
        System.out.println(Arrays.toString(ints));
    }
}
