package DSA.Arrays.Exercise;

import java.util.Arrays;

public class MaxIndex {
    public static void main(String[] args){
        int[] arr1 = new int[]{9,4,8,16,19,2};
        int[] arr = new int[]{0, 1};
        System.out.println(maxIndex(arr1));
        //System.out.println(maxIndexDiff(arr1));
    }

    private static int maxIndex(int[] arr) {
        int n= arr.length;
        if(n<2)
            return 0;

        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        Arrays.fill(leftArr,0);
        Arrays.fill(rightArr,0);

        leftArr[0] = arr[0];
        rightArr[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            leftArr[i] = Math.min(leftArr[i - 1], arr[i]);
            rightArr[n-1-i] = Math.max(rightArr[n-1-i+1],
                    arr[n-1-i]);
        }
        rightArr[0] = Math.max(rightArr[n-1],arr[0]);
        int i=0,j=0,maxdiff=0;
        while (i<n && j<n){
            if(leftArr[i] <=rightArr[j]){
                maxdiff = Math.max(maxdiff,j-i);
                j++;
            }else {
                i++;
            }
        }
        return maxdiff;
    }

}
