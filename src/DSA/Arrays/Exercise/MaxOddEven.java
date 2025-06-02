package DSA.Arrays.Exercise;

public class MaxOddEven {
    public static void main(String[] args){
        System.out.println(maxOddEven(new int[]{12,3,4,5}));
        System.out.println(maxOddEven(new int[]{10,12,14,7,8}));
    }

    private static int maxOddEven(int[] arr) {
        int count =0, subCount=0;
        for(int i=1;i<arr.length;i++){
            if((arr[i-1]%2 ==0 && arr[i]%2 !=0) || (arr[i-1] %2 !=0 && arr[i]%2 ==0)){
                count++;
            }else {
                count=0;
            }
            subCount = Math.max(count,subCount);
        }
        return subCount+1;
    }
}
