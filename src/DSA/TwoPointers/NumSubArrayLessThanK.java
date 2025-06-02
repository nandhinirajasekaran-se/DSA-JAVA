package DSA.TwoPointers;

public class NumSubArrayLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0,product = 1,left=0;
        if(k<=0)
            return 0;

        for(int right=0;right<nums.length;right++){
            product *= nums[right];

            while (product>=k){
                product /=nums[left];
                left++;
            }

            count += right-left+1;
        }
        return count;
    }
    public  static void  main(String[] args){
        NumSubArrayLessThanK numSubArrayLessThanK = new NumSubArrayLessThanK();
        System.out.println(
                numSubArrayLessThanK.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }
}
