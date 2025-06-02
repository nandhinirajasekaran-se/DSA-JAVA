package DSA.TwoPointers;

import java.util.Arrays;

public class DutchNationalFlag {
    public void solveDutchFlag(int[] nums){
        int low=0,mid=0,high=nums.length-1;
        while (mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args){
        DutchNationalFlag dutchNationalFlag = new DutchNationalFlag();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        dutchNationalFlag.solveDutchFlag(nums);
        System.out.println(Arrays.toString(nums));
    }
}
