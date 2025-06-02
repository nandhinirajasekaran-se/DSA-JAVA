package DSA.TwoPointers;

import java.util.stream.IntStream;

public class UnsortedSubarrayLength {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left=-1,right=-1;
        int maxSeen = Integer.MIN_VALUE;
        int minSeen = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            maxSeen = Math.max(maxSeen,nums[i]);
            if(nums[i]<maxSeen)
                right = i;
        }
        for (int i=nums.length-1;i>=0;i--){
            minSeen = Math.min(minSeen,nums[i]);
            if(nums[i]>minSeen)
                left = i;
        }

        if (right == -1) return 0;
        return right-left+1;
    }
    public static void main(String[] args) {

        UnsortedSubarrayLength unsortedSubarrayLength = new UnsortedSubarrayLength();
        System.out.println(unsortedSubarrayLength.
                findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
    }
}
