package DSA.Arrays;

public class MaxDifference {

    public static int maxDifference(int[] arr) {
        int maxDiff = arr[1]-arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-min>maxDiff){
                maxDiff = arr[i]-min;
            }
            if(arr[i]<min){
                min = arr[i];
            }

        }return maxDiff;

    }
    public static void main(String[] args) {
        System.out.println(maxDifference(new int[]{1,2,3,4,5}));
    }
}
