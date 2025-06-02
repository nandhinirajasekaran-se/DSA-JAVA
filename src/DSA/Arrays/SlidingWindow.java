package DSA.Arrays;

public class SlidingWindow {
    public static int slidingWindow(int[] arr, int k){
        int maxSum=0,currSum=0;

        for (int i=0;i<=arr.length-k;i++){
            currSum=0;
            for (int j=i;j<i+k;j++){

                currSum += arr[j];
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        System.out.println(slidingWindow(new int[]{1,1,0,1,11,56},3));
    }
}
