package DSA.Arrays.Exercise;

import java.util.Arrays;

public class RotateArray {
    private static void reverseArr(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static int[] rotateArr(int[] arr, int d){
        int n=arr.length;
        d %= n;
        reverseArr(arr,0,d-1);
        System.out.println(Arrays.toString(arr));
        reverseArr(arr,d,n-1);
        System.out.println(Arrays.toString(arr));
        reverseArr(arr,0,n-1);

        return arr;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(rotateArr(new int[]{1,2,3,4,5},13)));
    }
}
