package practise;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = new int[]{2,7,11,15};
        int target = 18;
        List<Integer> lookup = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(lookup.contains(target-arr[i])) {
                System.out.println(lookup.indexOf(target - arr[i]) + " " + i);
                break;
            }
            lookup.add(arr[i]);
        }
    }
}
