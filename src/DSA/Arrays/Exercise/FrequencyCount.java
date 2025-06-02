package DSA.Arrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args){
        System.out.println(frequencyCount(new int[]{2,3,2,3,5}));
        System.out.println(frequencyCountEff(new int[]{2,3,2,3,5}));

        System.out.println(Arrays.stream(new int[]{2,3,2,3,5}).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }

    private static List<Integer> frequencyCount(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            int count=0;
            for(int num:arr){
                if(num==i)
                    count++;
            }
            list.add(count);
        }return list;
    }
    private static List<Integer> frequencyCountEff(int[] arr) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(arr.length,0));

            for(int num:arr){
                list.set(num-1,
                        list.get(num-1)+1);
            }

        return list;
    }
}
