package DSA.Sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    private static int[] mergeSorted(int[] arrA, int[] arrB){
        int[] arr = new int[arrA.length+arrB.length];
        int i=0,j=0,k=0;
        while (i<arrA.length && j<arrB.length){
            if(arrA[i] <= arrB[j])
                arr[k++]=arrA[i++];
            else
                arr[k++]=arrB[j++];
        }
        while (i<arrA.length){
            arr[k++]=arrA[i++];
        }
        while (j<arrB.length){
            arr[k++]=arrB[j++];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arrA = {1,2,3,5,9};
        int[] arrB = {4,7,8,11,23};
        int[] arr = mergeSorted(arrA,arrB);
        System.out.println(Arrays.toString(arr));
    }
}
