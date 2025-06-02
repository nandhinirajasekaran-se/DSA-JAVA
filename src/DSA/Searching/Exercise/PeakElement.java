package DSA.Searching.Exercise;

public class PeakElement {
    public static void main(String[] args){
        System.out.println(peakElement1(new int[]{1, 2, 4, 5, 7, 8, 3}));
        //System.out.println(peakElement1(new int[]{10, 20, 15, 2, 23, 90, 80}));
    }

    private static boolean peakElement1(int[] arr) {
        int start =0, end =arr.length-1;
        int n = arr.length;
        if(arr.length==3)
            return true;

        while (start<=end){
            int mid = start +(end-start)/2;
            if( (mid ==0 || (arr[mid] > arr[mid-1])) && (mid==n-1 || (arr[mid] > arr[mid+1])))
                return true;

            if(mid > 0 && arr[mid - 1] >= arr[mid])
                end = mid -1;
            else
                start = mid + 1;
        }
        return false;
    }
}
