package DSA.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateLeft {

    public static int[] rotateLeft(int[] arr, int k) {
        for(int j=0;j<k;j++){
            int temp = arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }

    public static int[] rotateLeftEff(int[] arr, int k) {

        int[] left = Arrays.copyOfRange(arr,0,k);
        int[] right = Arrays.copyOfRange(arr,k,arr.length);
        return IntStream.concat(Arrays.stream(right),Arrays.stream(left)).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft(new int[]{1,2,3,4,5,6,7}, 3)));
        System.out.println(Arrays.toString(rotateLeftEff(new int[]{1,2,3,4,5,6,7}, 3)));
    }
}
