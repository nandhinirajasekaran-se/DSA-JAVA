package DSA.Searching.Exercise;

import java.util.Arrays;

public class SmallPositiveNumber {
    public static void main(String[] args){
        System.out.println(smallPositiveNumber(new int[]{2, -3, 4, 1, 1, 7}));
        System.out.println(smallPositiveNumber(new int[]{5,3,2,5,1}));
        System.out.println(smallPositiveNumber(new int[]{-8, 0, -1, -4, -3}));
    }

    private static int smallPositiveNumber(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length,start=0,end=n-1,num=arr[end];

        while (start<=end){
            int mid = start+(end-start)/2;

            if(mid!=0 && arr[mid]>0 && arr[mid] > arr[mid-1]+1){
                num=Math.min(num,arr[mid-1]>1 ? arr[mid-1]+1 : 1);
                end=mid-1;
            }else if(mid<n-1 && arr[mid]>0 && arr[mid] < arr[mid+1]-1){
                num=Math.min(num,arr[mid]+1);
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        if(num==arr[arr.length-1])
            return num+1;

        return num;
    }
}
