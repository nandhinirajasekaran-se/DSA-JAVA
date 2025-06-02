package DSA.Arrays.Exercise;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){
        System.out.println(Arrays.toString(reverseInGroup(new int[]{1,2,3,4,5,6,7,8},3)));
    }

    private static int[] reverseInGroup(int[] arr, int k) {

        int n=arr.length;
        int left=0,right=0;
        for(int i=0;i<n;i+=k){
            left =i;
            right=Math.min(i+k-1,n-1);
            while (left <right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
