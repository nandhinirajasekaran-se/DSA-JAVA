package DSA.Searching.Exercise;

public class ArraySearch {
    public static void main(String[] args){
        //System.out.println(arraySearch(new int[]{0,1,2,3,4},5,0,4));
        //System.out.println(arraySearch(new int[]{1,2,3,4,5},0,0,4));
        System.out.println(binarySearch2(new int[]{1,2,3,4,5},1));
    }

    private static int arraySearch(int[] arr, int n, int start, int end) {
        int mid = (start+end)/2;
        if(arr[mid]==n){
            return mid;
        } else if (arr[mid] > n && end > 0) {
            return arraySearch(arr,n,start,mid-1);
        }else if(arr[mid] < n && start <arr.length) {
            return arraySearch(arr,n,mid+1,end);
        } else if (start >=arr.length || end<=0) {
            return -1;
        }
        return -1;
    }
    private static boolean binarySearch2(int[] arr, int n) {
        int start=0,end=arr.length;

        while (start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]==n){
                return true;
            } else if (arr[mid] < n) {
                start=mid+1;
            }else if(arr[mid] > n) {
                end=mid-1;
            }
        }
        return false;
    }
}
