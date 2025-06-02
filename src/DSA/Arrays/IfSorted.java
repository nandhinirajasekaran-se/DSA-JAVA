package DSA.Arrays;

import java.util.stream.IntStream;

public class IfSorted {
    public static boolean ifSorted(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
           if( arr[i]>arr[i+1])
               return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The Array is sorted order: "+ifSorted(new int[]{1,2,2,4,5}));
        int[] arr = new int[]{1,2,2,4,5};
        System.out.println(IntStream.range(0,arr.length-1).allMatch(i-> arr[i] <= arr[i+1]));
        //Check if order is in descending order
        //System.out.println(IntStream.range(0,arr.length-1).allMatch(i-> arr[i] >= arr[i+1]));
    }
}
