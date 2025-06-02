package DSA.Arrays;

import java.util.Arrays;

public class MergesortedArray {

    public static int[] merge(int[] A, int[] B) {
        int[] mergedArray = new int[A.length + B.length];
        int n = A.length;
        int m = B.length;
        int i = 0, j = 0,k = 0;
        while (i <n && j <m){
            if(A[i]<B[j]){
                mergedArray[k++] = A[i++];
            }else {
                mergedArray[k++] = B[j++];
            }
        }while (i<n){
            mergedArray[k++] = A[i++];
        }while (j<m){
            mergedArray[k++] = B[j++];
        }
        return mergedArray;
    }
    public static void main(String[] args) {

        int[] A = {1,3,5,7};
        int[] B = {2,4,6};
        int[] mergedArray = merge(A,B);
        Arrays.stream(mergedArray).forEach(System.out::print);
    }
}
