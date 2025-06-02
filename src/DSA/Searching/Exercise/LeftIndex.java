package DSA.Searching.Exercise;

public class LeftIndex {
    public static void main(String[] args){
        System.out.println(leftIndex(new int[]{1,4,7,7,7,7,7,8,9,11,17},3));
        System.out.println(leftIndex(new int[]{1,4,7,8,9,11,11,11,11,11,17},11));
        System.out.println(leftIndex(new int[]{1 ,1 ,2 ,2 ,3 ,4 ,5 ,5 ,6 ,7},10));
    }

    private static int leftIndex(int[] arr,int x) {
        int start =0, end =arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                if(mid==0 || arr[mid-1]!=x )
                    return mid;
                else
                    end=mid-1;
            }else if(arr[mid]<x){
                start=mid+1;
            }else if(arr[mid]>x){
                end= mid-1;
            }
        }
        return 0;
    }
}
