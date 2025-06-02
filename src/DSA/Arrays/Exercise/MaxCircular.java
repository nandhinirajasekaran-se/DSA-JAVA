package DSA.Arrays.Exercise;

public class MaxCircular {
    public static void main(String[] args){
        System.out.println(maxSubCir(new int[]{1,2,3,4,-1}));
    }

    private static int maxSubCir(int[] arr) {
        int n=arr.length,maxSum=0,currMax=0,minSum=0,currMin=0,totalSum=0;
        for(int i=0;i<n;i++){
            currMax = Math.max(currMax+arr[i],arr[i]);
            maxSum = Math.max(currMax,maxSum);

            currMin = Math.min(currMin+arr[i],arr[i]);
            minSum = Math.min(currMin,minSum);

            totalSum += arr[i];
        }
        int sum = maxSum;
        int circularSum = totalSum - minSum;

        if(minSum == totalSum)
            return sum;

        return Math.max(sum,circularSum);
    }
}
