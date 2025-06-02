package DSA.Arrays.Exercise;

public class BuySell {
    public static void main(String[] args){
        System.out.println(buySell(new int[]{100, 180, 260, 310, 40, 535, 695}));
        System.out.println(buySell(new int[]{4, 2, 2, 2, 4}));
        System.out.println(buySell(new int[]{4, 2}));
    }

    private static int buySell(int[] arr) {
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                sum +=arr[i]-arr[i-1];
            }
        }
        return sum;
    }
}
