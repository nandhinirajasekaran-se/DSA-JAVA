package DSA.Searching.Exercise;

import java.util.Arrays;

public class Nk {
    public static void main(String[] args){
        System.out.println(nkFind(new int[]{3, 1, 2, 2, 1, 2, 3, 3},4));
        System.out.println(nkFind(new int[]{2, 3, 3, 2},3));
        System.out.println(nkFind(new int[]{1, 4, 7, 7},2));
    }

    private static int nkFind(int[] arr, int k) {
        int nk=arr.length/k,count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i-1]!=arr[i]){
                int lastOcr = lastOcr(arr,arr[i]);
                int firstOcr = firstOcr(arr,arr[i]);
                count += (lastOcr-firstOcr)+1 > nk ? 1:0;
            }
        }
        return count;

    }
    private static int lastOcr(int[] arr,int num) {
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==num && (mid==arr.length-1 || arr[mid+1]!=num)){
                return mid;
            }else if(arr[mid] > num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    private static int firstOcr(int[] arr,int num) {
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==num && (mid==0 || arr[mid-1]!=num)){
                return mid;
            }else if(arr[mid]<num){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
