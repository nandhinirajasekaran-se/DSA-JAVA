package DSA.Searching.Exercise;

import java.util.ArrayList;

public class SubArrayInteger {
    public static void main(String[] args){
        System.out.println(sumSubArrTarget(new int[]{1, 2, 3, 7, 5},12));
    }

    private static ArrayList<Integer> sumSubArrTarget(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int currentSum=0,left=0;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            while (currentSum>target && left<=i){
                currentSum -= arr[left];
                left += 1;
            }
            if(currentSum==target){
                list.add(left+1);
                list.add(i+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
