package DSA.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToClosest {

    private static List<List<Integer>> threeSum(int[] nums,int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
           // if (i > 0 && nums[i] == nums[i - 1])
           //     continue;

            int currentSum = 0;
            int left = i+1;
            int right = nums.length-1;

            while (left<right){
                currentSum = nums[i]+nums[left]+nums[right];
                if (currentSum<target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                }else {
                    left++;
                }
            }
        }return res;
    }
    public static void main(String[] args){

        System.out.println(threeSum(new int[]{-2,0,1,3},2 ).toString());
    }
}
