package DSA.Arrays;

public class ConsecutiveFlips {

    static int consecutiveFlips(int[] arr){

        int count =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i] != arr[0])
                    System.out.print("Coin is flipped from "+i+ " to ");
                else {
                    count++;
                    System.out.println(i - 1);
                }
            }
        }
        if (arr[arr.length - 1] != arr[0])
            System.out.println(arr.length-1);
        return count;
    }
    public static void main(String[] args){
        System.out.println("consecutive flips "+ consecutiveFlips(new int[]{0,1,1,1,0}));
        System.out.println("consecutive flips "+ consecutiveFlips(new int[]{1, 1, 0, 0, 0, 1}));

        System.out.println("consecutive flips "+ consecutiveFlips(new int[]{ 0, 0, 0}));
    }
}
