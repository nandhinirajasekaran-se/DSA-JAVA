package DSA.Arrays.Exercise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RearrangeAlternatively {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};
        checkRearrange(arr);
        //System.out.println(Arrays.toString(checkRearrange(new int[]{890,289,483,519,550,447,946,957,92,783})));
    }

    private static void checkRearrange(int[] arr) {
        int n = arr.length;
        arr = Arrays.stream(arr).sorted().toArray();
        int maxElement = arr[n-1]+1;
        int minIndex=0, maxIndex=n-1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            }else{
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] /= maxElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
