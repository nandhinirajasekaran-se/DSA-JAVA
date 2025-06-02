package DSA.Arrays;

public class BuySellStock {

    public static int maxProfit(int[] arr){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                max+=(arr[i]-arr[i-1]);
            }
        } return max;
    }
    public static void main(String[] args) {
        int[] price = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maxProfit(price));
    }
}
