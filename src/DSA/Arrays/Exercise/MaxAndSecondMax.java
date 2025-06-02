package DSA.Arrays.Exercise;

import java.util.ArrayList;

public class MaxAndSecondMax {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0,secondMax = 0;
        for (int i=0;i<sizeOfArray;i++){
            if(arr[i]>max && arr[i]>secondMax){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        list.add(max);
        list.add(secondMax);
        System.out.println(list);
        return list;

    }
    public static void main(String[] args){
        largestAndSecondLargest(6,new int[]{1,2,3,4,5,6});
    }
}
