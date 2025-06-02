package DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MaxFreq {
    static void printMazFreq(int[] arr){
     int index =0,count=0,maxCount=0;

     for(int i=0;i< arr.length;i++){
         count=0;
         for(int j=0;j<arr.length;j++){
             if(arr[i]==arr[j]){
                 count++;
             }
         }
         if(count> maxCount){
             maxCount = count;
             index=i;
         }
     }
     if(count>arr.length/2)
         System.out.println("count:"+count+","+arr[index]);
     else
         System.out.println("No Majority element");
    }
    public static void main(String[] args){

        printMazFreq(new int[]{12,4,5,5,5,6,1,5,5,5});
        Map<Integer,Long> map = Arrays.stream(new int[]{12,4,5,5,5,6,1,5,5,5})
                .boxed().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(1).forEach(System.out::println);

    }
}
