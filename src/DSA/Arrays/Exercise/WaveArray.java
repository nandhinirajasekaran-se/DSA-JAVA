package DSA.Arrays.Exercise;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(waveGrp(new int[]{2,4,7,8,9,10})));
    }

    private static int[] waveGrp(int[] arr) {

        int n=arr.length;
        int left=0,right=0;
        for(int i=0;i<n;i+=2){
            left =i;
            right=Math.min(i+2-1,n-1);
            while (left <right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
