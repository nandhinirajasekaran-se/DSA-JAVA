package DSA.TwoPointers;

import java.util.Arrays;

public class DuplicateZeros {
    private static void duplicateZeros(int[] arr) {
        int zeroes = 0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zeroes++;
        }
        for (int i=n-1;i>=0;i--){
            int j=i+zeroes;
            if(j<n){
                arr[j]=arr[i];
            }
            if (arr[i]==0){
                zeroes--;
                if (i+zeroes<n)
                    arr[i+zeroes]=0;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{0,0,1,2,3,4};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

}
