package DSA.Arrays;

public class MaxSubArray {

    public static void maxArray(int[] arr){
        int endIndex=0, currMax=arr[0], globMax=arr[0];
        for(int i=1;i<arr.length;++i) {
            currMax = Math.max(arr[i], arr[i] + currMax);
            if (currMax > globMax) {
                globMax = currMax;
                endIndex = i;
            }
            System.out.println(i+":"+endIndex+":"+currMax+":"+globMax);
        }
        int startIndex = endIndex;
        while (startIndex>=0){
            globMax -= arr[startIndex];
            if(globMax==0){
                break;
            }System.out.println(startIndex+":"+endIndex+":"+globMax);
            startIndex--;
        }
        for (int i=startIndex;i<=endIndex;++i){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        maxArray(new int[]{-2, -5, 6, -2, -3, 1, 5, -11, 11, 2, 7});
    }
}
