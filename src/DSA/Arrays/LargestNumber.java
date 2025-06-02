package DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LargestNumber {
    public static int largestNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).reduce(Integer::max));
        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).boxed().max(Comparator.naturalOrder()));
        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).boxed().mapToInt(Integer::intValue).max());
        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).boxed().collect(Collectors.maxBy(Comparator.naturalOrder())));
        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).boxed().collect(Collectors.summarizingInt(Integer::intValue)).getMax());
    }
}
