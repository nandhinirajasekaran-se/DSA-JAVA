package DSA.TwoPointers;

public class RemoveDuplicateArray {

    private static int removeDuplicates1(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2;

        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    private static int removeDuplicates(int[] nums) {
        boolean isDuplicate = false;
        int[] res = new int[nums.length];
        int count = 0;
        res[count++]= nums[0];
        res[count++]= nums[1];
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1] && nums[i]==nums[i-2] ){
                isDuplicate = true;
            }
            if( isDuplicate && !(res[count-1] == nums[i] && res[count-2] == nums[i])){
                res[count++] = nums[i];
                res[count++] = nums[i];
            }else{
                if(!(res[count-1] == nums[i] && res[count-2] == nums[i])){
                    res[count++] = nums[i];
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{1,2,3,3,3,3,4,4,4,4}));
        System.out.println(removeDuplicates1(new int[]{1,2,3,3,3,3,4,4,4,4}));
    }
}
