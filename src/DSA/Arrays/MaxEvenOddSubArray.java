package DSA.Arrays;

public class MaxEvenOddSubArray {

    public static int maxSubArray(int[] arr){
        int ans = 0,cnt =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j-1] % 2 ==0 && arr[j] % 2 !=1) || (arr[j-1] % 2 !=0 && arr[j] % 2== 0)){
                    cnt++;
                }else
                    break;
            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }

    public static int maxSubEvenOdd(int[] arr){
        if (arr.length==0)
            return 0;
        int maxLength = 0, curr = 0;
        int preOdd = arr[0] % 2;
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2 != preOdd){
                curr++;
            }else {
                curr=0;
            }
            maxLength = Math.max(curr, maxLength);
            preOdd = arr[i] % 2;
        }
        return maxLength;
    }

    public static void main(String[] args){
        System.out.println(maxSubArray(new int[]{1,2,3,4,6,7,8}));
        System.out.println(maxSubEvenOdd(new int[]{1,2,3,4,6,7,8}));
        System.out.println(maxSubArray(new int[]{1,3,5}));
        System.out.println(maxSubEvenOdd(new int[]{1,3,5}));

    }
}
