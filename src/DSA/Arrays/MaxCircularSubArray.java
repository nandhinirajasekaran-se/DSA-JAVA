package DSA.Arrays;

public class MaxCircularSubArray {
    public static int maxCircular(int[] arr){
        int res = arr[0];
        for(int i=0;i<arr.length;i++){
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for(int j=1;j<arr.length;j++){
                int index = (i+j) % arr.length;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            res = Math.max(res,curr_max);
        }
        return res;
    }
    public static void main(String[] args){
      System.out.println(maxCircular(new int[]{8, -8, 9, -9, 10, -11, 12}));
      System.out.println(overallCircularSubArray(new int[]{8, -8, 9, -9, 10, -11, 12}));
    }

    static int maxSubArray(int[] arr){
        int res= arr[0], maxEnding = arr[0];

        for(int i=1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
    static int overallCircularSubArray(int[] arr){
        int maxNormal = maxSubArray(arr);
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = sum + maxSubArray(arr);
        return Math.max(maxCircular, maxNormal);
    }
}
