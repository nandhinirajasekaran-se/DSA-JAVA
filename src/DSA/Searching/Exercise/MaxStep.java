package DSA.Searching.Exercise;

public class MaxStep {
    public static void main(String[] args){
        System.out.println(maxStep(new int[]{1,2,3,4}));
        System.out.println(maxStep(new int[]{1,2,2,3,2}));
        System.out.println(maxStep(new int[]{20, 6, 5, 10, 7, 17, 19, 4, 17, 2, 18, 12, 16, 11}));
    }

    private static int maxStep(int[] arr) {
        int step=0, count =0,max=0;
        for(int i=1;i<arr.length;i++){

            if(arr[i-1]<arr[i] && max<=arr[i]){
                count += 1;
                max=Math.max(max,arr[i]);
                step = Math.max(count,step);

            }else {
                count=0;
            }
        }return step;
    }
}
