package DSA.Searching;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args){
        System.out.println("It is found at index "+ binarySearch1(new int[]{1,25,9,0,12,50},9,0,5));
        System.out.println("It is found at index "+ Arrays.binarySearch(new int[]{1,25,9,0,12,50},9));
        System.out.println("It is found at index "+ Collections.binarySearch(Arrays.asList(1,25,9,0,12,50),9));
    }

    private static int binarySearch1(int[] arr, int x, int l,int r) {
        int mid = (l+r)/2;
        if(arr[mid] > x){
            return binarySearch1(arr,x,l,mid);
        }else if(mid==x) {
            return binarySearch1(arr,x,l,mid);
        }else {
            return mid;
        }
    }
}
