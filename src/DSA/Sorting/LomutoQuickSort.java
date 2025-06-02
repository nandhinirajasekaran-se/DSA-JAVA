package DSA.Sorting;

import java.util.Arrays;

public class LomutoQuickSort {

    private static int sort(int[] arr, int start, int end){
        int pivot = arr[end];
        int index = start -1;
        int temp = 0;

        for(int i=start;i<end;i++){
            if( arr[i]<pivot){
                index++;
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        int pivotIndex = ++index;

        temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return pivotIndex;
    }
    private static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = sort(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    public static void main(String[] args){
        int[] numbers = { 4, 5, 1, 2, 4, 5, 6 };
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
