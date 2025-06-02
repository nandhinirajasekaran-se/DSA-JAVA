package DSA.Arrays;

import java.util.Arrays;
import java.util.Map;

public class MaxAppearingElement {
    static int maxAppearElement(int[] L, int[] R){
        int[] arr = new int[10];
        int max=0;
        for(int i=0;i< L.length;i++){
            arr[L[i]] +=1;
            arr[R[i]+1] -=1;
            max = Math.max(R[i],max);
        }
        System.out.println(Arrays.toString(arr));

        int msum=0;
        int index=0;
        for(int i=1;i<max;i++){
            arr[i] += arr[i-1];
            if(msum < arr[i]){
                msum=arr[i];
                index = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));


        return index;
    }
    public static void main(String[] args){
        System.out.println(maxAppearElement(new int[]{1,2,3},new int[]{3,5,7}));
    }
}
