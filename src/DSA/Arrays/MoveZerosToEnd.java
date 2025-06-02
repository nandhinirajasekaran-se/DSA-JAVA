package DSA.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToEnd {

    public static int[] moveZeroes(int[] nums) {
        int[] arr=new int[nums.length];
        int res=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[res++]=nums[i];
            }
        }
        if(res!=nums.length){
            Arrays.fill(arr,res,nums.length-1,0);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,1,0,2,0,3,0,4})));
        int[] input= new int[]{0,1,0,2,0,3,0,4};
        int[] arr = Arrays.stream(input).filter(i-> i>0).toArray();
        if(arr.length<input.length){
            int[] zeroes = new int[input.length-arr.length];
            Arrays.fill(zeroes,0);
            System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(arr),Arrays.stream(zeroes)).toArray()));
        }
    }
}
