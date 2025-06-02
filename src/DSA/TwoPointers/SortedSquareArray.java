package DSA.TwoPointers;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SortedSquareArray {
    private static int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int index= nums.length-1;
        int[] res = new int[nums.length];
        while (left<=right){
            int leftSq = nums[left]*nums[left];
            int rightSq = nums[right]*nums[right];
            if(leftSq>rightSq){
                res[index--]= leftSq;
                left++;
            }else {
                res[index--]=rightSq;
                right--;
            }
        }
        return res;
    }


    public static void main(String[] args){
        int[] nums = new int[]{-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(nums)));

        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
         sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
