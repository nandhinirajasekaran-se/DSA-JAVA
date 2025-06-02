package DSA.Arrays.Exercise;

import java.util.Arrays;

public class TrapWater {

    public static void main(String[] args){
        //System.out.println(trapWater(new int[]{3, 0, 1, 0, 4, 0,2}));
        //System.out.println(trapWater(new int[]{3, 0, 2, 0, 4}));
        //System.out.println(trapWater(new int[]{1, 2, 3, 4}));
        System.out.println(trapWaterEff(new int[]{2, 1, 5, 3, 1, 0, 4}));
    }

    private static int trapWaterEff(int[] arr) {
        int n = arr.length,water=0;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0]=arr[0];
        right[n-1]= arr[n-1];

        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], arr[i]);
            right[n-1-i] = Math.max(right[n-i],arr[n-1-i]);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int i=0;i<n;i++){
            water += Math.min(left[i],right[i])- arr[i];
        }
        return water;
    }

    private static int trapWater(int[] arr) {
        int max=arr[0],currSum=0,sum=0,n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]<max){
                currSum += max-arr[i];
            }else if(arr[i]>max){
                sum += currSum;
                currSum=0;
                max =arr[i];
            }
        }

        int minSum=0,minMax=arr[n-1];
        if(arr[n-1]<max){
            for(int i = n-2; i>0; i--)
                if(arr[i] == max){
                    sum +=minSum;
                    break;
                }else if (arr[i] < minMax) {
                    minSum += minMax-arr[i];
                } else if(arr[i] > minMax) {
                    sum += minSum;
                    minMax=arr[i];
                    minSum=0;
                }
        }

        return sum;
    }


}
