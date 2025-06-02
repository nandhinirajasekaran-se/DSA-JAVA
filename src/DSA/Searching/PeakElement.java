package DSA.Searching;

public class PeakElement {
    public static void main(String[] args){
        System.out.println(peakElement(new int[]{5, 10, 11, 12, 20, 12}));
    }

    private static int peakElement(int[] arr) {
        int n = arr.length-1;
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == n - 1 || arr[mid + 1] <= arr[mid]))
                return mid;
            if(mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }

        return -1;
    }
}
