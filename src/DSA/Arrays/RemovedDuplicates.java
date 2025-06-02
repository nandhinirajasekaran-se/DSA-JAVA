package DSA.Arrays;

import java.util.Arrays;

public class RemovedDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        int[] unq = new int[nums.length];
        int res=0;
        unq[res++]=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i-1]!=nums[i]) {
                System.out.println("I:"+i);
                unq[res++] = nums[i];
            }
        } return unq;
    }
    public static void main(String[] args) {
        int[] arr= removeDuplicates(new int[]{1,1,2,3,3,4});
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(Arrays.stream(new int[]{1,1,2,3,3,4}).distinct().toArray()));
    }
}
