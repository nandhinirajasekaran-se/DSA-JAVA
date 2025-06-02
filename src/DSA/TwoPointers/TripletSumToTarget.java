package DSA.TwoPointers;

import java.util.Arrays;

public class TripletSumToTarget {

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetSum = nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length;i++){
            int left =i+1;
            int right = nums.length-1;

            while (left<right){
                int currSum = nums[i]+nums[left]+nums[right];
                if(Math.abs(currSum-target)<Math.abs(closetSum-target)){
                    closetSum = currSum;
                }
                if (currSum<target){
                    left++;
                }else if(currSum>target){
                    right--;
                }else {
                    return target;
                }
            }
        }return  closetSum;
    }

    public static void main(String[] args){
        System.out.println(threeSumClosest(new int[]{-84,92,26,19,-7,9,42,-51,8,30,-100,-13,-38},78));
    }
}
