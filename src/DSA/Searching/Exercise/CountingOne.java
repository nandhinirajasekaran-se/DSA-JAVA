package DSA.Searching.Exercise;

public class CountingOne {
    public static void main(String[] args){
        System.out.println(countOnes(new int[]{1,1,0,0,0,0}));
        System.out.println(countOnes(new int[]{1,1,1,1,1,0,0,0}));
    }

    private static int countOnes(int[] arr) {
        int n=arr.length;
        int start =0, end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==1 && (mid==n-1 || arr[mid+1]!=1))
                return mid+1;
            else if(mid<n-1 && arr[mid]==1 && arr[mid+1]==1){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return 0;
    }
}
