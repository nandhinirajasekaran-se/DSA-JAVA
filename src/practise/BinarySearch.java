package practise;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr = new int[]{4,5,9,10};
        int target = 5;
        int low=0,high=arr.length,mid=0;
        while (low<=high){
            mid = low+high/2;
            if(arr[mid]==target) {
                System.out.println("\nindex:" +mid);
                break;
            }
            else if(arr[mid]>target){
                high= mid;
            }else {
                low=mid;
            }
        }
    }
}
