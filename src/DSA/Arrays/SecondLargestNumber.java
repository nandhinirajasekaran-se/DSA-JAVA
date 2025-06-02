package DSA.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SecondLargestNumber {

    public static int secondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            }else if(arr[i] < max  && arr[i] < secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{1,8,2,3,4,5,6,7,9}));
        System.out.println(Arrays.stream(new int[]{1,8,2,3,4,5,6,7,9}).boxed().sorted(
                Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("N is out of range")));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //To find smallest
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int k=3;
        Arrays.stream(new int[]{1,8,2,3,11,4,5,6,7,9}).forEach(i -> {
           pq.offer(i);
           if(pq.size()>k)
               pq.poll();
        });
        System.out.println(pq.peek());
    }


}
