package DSA.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseOrder {

    public static int[] reverseOrder(int[] arr) {
        int temp;
        for(int i=(arr.length-1)/2;i>=0;i--){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Arrays.stream(reverseOrder(new int[]{1,2,3,4,5})).forEach(System.out::print);
        int[] arr = new int[]{1,2,3,4,5};
        long[] reverseArr = IntStream.range(0,arr.length).mapToLong(i-> arr[arr.length-1-i]).toArray();
        System.out.println(Arrays.toString(reverseArr));
    }

}
