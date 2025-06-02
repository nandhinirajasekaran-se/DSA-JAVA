package DSA.Arrays.Exercise;

public class KadaneAlg {
    public static void main(String[] args){
        System.out.println(kadaneAlg(new int[]{2, 3, -8, 7, -1, 2, 3}));
        System.out.println(kadaneAlg(new int[]{-2, -4}));
        System.out.println(kadaneAlg(new int[]{5, 4, 1, 7, 8}));
        System.out.println(kadaneAlg(new int[]{}));
    }

    private static int kadaneAlg(int[] arr) {
        int maxSub=arr[0], currSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum = Math.max(currSum+arr[i],arr[i]);
            maxSub = Math.max(maxSub,currSum);
        }
        return maxSub;
    }
}
