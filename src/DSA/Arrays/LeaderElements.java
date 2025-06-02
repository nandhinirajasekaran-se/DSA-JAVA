package DSA.Arrays;

import java.util.Arrays;

public class LeaderElements {

    public static int[] findElements(int[] arr) {
        int[] res = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(temp<arr[j]){
                    break;
                }else if(j==arr.length-1){
                    res[k++]=temp;
                }
            }
        }
        res[k]=arr[arr.length-1];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findElements(new int[]{1,6,2,3,4})));
    }
}
