package DSA.TwoPointers;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args){
        int[] arr = new int[]{7,9,7,4,2,8,7,7,1,5};
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==0){
                System.out.println( arr[i]);
                break;
            }
        }

    }
}
