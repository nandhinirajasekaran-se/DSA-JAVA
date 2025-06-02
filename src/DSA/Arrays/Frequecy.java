package DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequecy {
    public static Map<Integer,Integer> frequencyCheck(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1; i<=arr.length; i++){
            map.computeIfAbsent(arr[i-1],k->1);
            if( i<arr.length && arr[i-1]==arr[i]){
                map.compute(arr[i-1], (k, v) -> (v == null) ? 1 : v + 1);
            }
        }return map;
    }
    public static void main(String[] args) {
        System.out.println(frequencyCheck(new int[]{1,2,2,3,3,3,4}));
        System.out.println(Arrays.stream(new int[]{1,2,2,3,3,3,4}).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println(Arrays.stream(new int[]{1,2,2,3,3,3,4}).boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())));

    }
}
