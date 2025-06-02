package DSA.Sorting;

import java.util.Arrays;

public class NaiveQuickSort {
    private static int partition(int[] arr, int start, int end){
        int[] temp = new int[(end-start)+1];
        int pivot = arr[end];
        int index = 0;
        for(int i=start;i<=end;i++){
            if(arr[i]< pivot){
                temp[index++] = arr[i];
            }
        }
        int position = index;
        temp[index++]=pivot;
        for(int i=start;i<=end;i++){
            if(arr[i]> pivot){
                temp[index++] = arr[i];
            }
        }
        for(int i=start;i<=end;i++){
            arr[i]= temp[i-start];
        }
        return position;
    }

    private static void quickSort(int[] arr, int start, int end){
        if( start < end){
            int point = partition(arr, start, end);
            quickSort(arr, start, point-1);
            quickSort(arr, point+1, end);
        }
    }

    public static void main(String[] args){
        int[] arr  = {3, 2, 1, 78, 9798, 97};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
