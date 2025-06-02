package DSA.Arrays.Exercise;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(reArrange(new long[]{4,0,2,1,3})));
    }

    private static long[] reArrange(long[] arr) {
        long n=arr.length;
        for(int i=0;i<n;i++){
            arr[i] += (arr[(int) arr[i]] % n) * n;
        }

        for(int i=0;i<n;i++){
            arr[i] /=n;
        }
        return arr;
    }
}
