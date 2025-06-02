package DSA.Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingB {
    public static void main(String[] args){
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr,1,5);
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));

        System.out.println(" ");
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));

        Integer[] arr1 = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr1, Collections.reverseOrder());

        System.out.println(" ");
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
