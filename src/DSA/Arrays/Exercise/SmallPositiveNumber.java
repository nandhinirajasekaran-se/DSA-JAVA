package DSA.Arrays.Exercise;

import java.util.Arrays;

public class SmallPositiveNumber {
    public static void main(String[] args){
        /*System.out.println(smallPosivite(new int[]{2, -3, 4, 1, 1, 7}));
        System.out.println(smallPosivite(new int[]{5, 3, 2, 5, 1}));//
        System.out.println(smallPosivite(new int[]{-8, 0, -1, -4, -3}));
        System.out.println(smallPosivite(new int[]{1,2,3,4,5})); // 6
        System.out.println(smallPosivite(new int[]{0,0,-7})); //1*/
        System.out.println(smallPosivite(new int[]{1,-19})); //1

       // System.out.println(smallPosivite(new int[]{2,6,2,-8,-7,8}));
        //System.out.println(smallPosivite(new int[]{0,-10,1,3,-20}));
        //System.out.println(smallPosivite(new int[]{2,2,-5,2,-2,7,1,-8}));

    }

    private static int smallPosivite(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        if (n<2)
            return 1;

        int min = n*arr[n-1];

        for(int i=1;i<n;i++){
            if( arr[i]>1 && (arr[i-1]+1 != arr[i])
                    && (arr[i-1] != arr[i])){
                min = Math.min(min, arr[i-1] <= 0 ? 1: arr[i-1]+1);
            }
        }
        min = Math.min( min, arr[n-1]+1);
        if((arr[0]>1 && arr[n-1]>1) || (arr[0]<1 && arr[n-1]<1)){
            min = 1;
        }

        return  min;
    }
}
