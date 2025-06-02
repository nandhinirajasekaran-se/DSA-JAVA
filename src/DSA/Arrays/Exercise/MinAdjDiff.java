package DSA.Arrays.Exercise;

public class MinAdjDiff {

    public static void main(String[] args){
        System.out.println(minAdjDiff(new int[]{8,-8,9,-9,10,-11,12}));
        System.out.println(minAdjDiff(new int[]{17 ,63, 80}));
        System.out.println(minAdjDiff(new int[]{70,93,59,35,4,98 ,94,45,
                89,18,13 ,75, 55, 28, 48, 52, 24, 96, 91, 38, 38, 19, 18, 42, 87, 48, 84, 92,
                20, 62, 9, 74, 36, 11, 57, 41, 52, 31, 37, 43, 72, 34, 60, 51}));
    }

    private static int minAdjDiff(int[] arr) {
        int minGlob = Math.abs(arr[0]-arr[1]);
        for (int i=1;i<=arr.length;i++){
            if(i==arr.length) {
                minGlob = Math.min(Math.abs(arr[i-1] - arr[0]), minGlob);
            }
            else {
                minGlob = Math.min(Math.abs(arr[i - 1] - arr[i]), minGlob);
            }
        }
        return minGlob;
    }
}
