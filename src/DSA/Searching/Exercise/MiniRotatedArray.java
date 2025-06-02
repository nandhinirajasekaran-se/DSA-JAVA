package DSA.Searching.Exercise;

public class MiniRotatedArray {
    public static void main(String[] args){
        System.out.println(miniSortedArray(new int[]{2,3,4,5,6,7,8,9,10,1},0,9));
        System.out.println(miniSortedArray(new int[]{4,5,6,7,8,9,10,1,2,3},0,9));
        System.out.println(miniSortedArray(new int[]{50,48,49},0,2));
        System.out.println(miniSortedArray(new int[]{4,5,6,7,8,9,10,0,2,3},0,9));
        System.out.println(miniSortedArray(new int[]{4,5,6,7,8,9,10},0,6));
    }

    private static int miniSortedArray(int[] arr, int low, int high) {
        while (low<=high){
            int mid = low+(high-low)/2;
            if(mid > 0 && mid <= arr.length-1 && arr[mid-1] > arr[mid] && ( mid ==arr.length-1 || arr[mid] < arr[mid+1]))
                return arr[mid];
            //else if(mid < arr.length-1 && arr[0] < arr[mid] && arr[mid]<arr[mid+1]){
            //    low = mid+1;
            //}
            else if(mid < arr.length-1 && arr[0] > arr[mid] && arr[mid]<arr[mid+1]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return arr[0];
    }
}
