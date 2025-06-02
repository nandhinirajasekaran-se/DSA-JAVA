package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {

    private void sort(int[] arr,int l, int r){
        if (l<r){
            int m = l+(r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1,r);
            merge(arr, l, m, r);
        }
    }
    private void  merge(int[] arr, int l,int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        //System.arraycopy(arr, l + 0, L, 0, n1);
        for(int i=0;i<n1;i++){
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i] <= R[j])
                arr[k++] =L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i<n1){
            arr[k++] =L[i++];
        }
        while (j<n2){
            arr[k++] =R[j++];
        }

    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arrA = {1,2,12,10,9,4};

         ms.sort(arrA,0, arrA.length-1);
         System.out.println(Arrays.toString(arrA));
    }
}