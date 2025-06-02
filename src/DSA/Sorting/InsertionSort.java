package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {

     private void sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
     }
     public static void main(String[] args) {
        int[] arr = {3,4,8,6,7};
         InsertionSort ob = new InsertionSort();
         ob.sort(arr);
         System.out.println(Arrays.toString(arr));
    }
}
