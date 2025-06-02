package DSA.Searching.Exercise;

public class FloorIndex {
    public static void main(String[] args){
        //System.out.println(floorIndex(new int[]{1, 2, 8, 10, 10, 12, 19},10));
        System.out.println(findFloor(new int[]{8, 18, 26, 28, 32, 35, 37, 38, 42, 47, 49, 51, 51, 67, 80},80));
       /* System.out.println(floorIndex(new int[]{4,15 ,17 ,17 ,19, 20, 21, 22, 22, 25, 26, 26, 26, 28, 28, 28, 31, 31, 32,
                33, 34, 34, 35, 36, 36, 37, 38, 38, 39, 41, 41, 42, 43,
                43, 44, 44, 45, 45, 46, 47, 49, 49, 50, 50, 50, 51, 53, 54, 54, 56, 57, 58, 58, 59, 60, 64, 67, 69, 75, 94
        },26));*/
    }

    static int findFloor(int[] arr, int x) {
        // write code here
        int n=arr.length,ans=-1;
        int start=0,end=n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x && (mid==n-1 || arr[mid+1]!=x))
                return mid;
            else if(arr[mid] > x)
                end = mid-1;
            else if(arr[mid] < x){
                ans = mid;
                start = mid+1;

            }
        }
        return ans;
    }
    private static int floorIndex(int[] arr,int x) {
        int n = arr.length, ans=-1;
        int start=0,end=n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x && (mid==n-1 || arr[mid+1]!=x))
                return mid;
            else if(arr[mid] > x)
                end = mid-1;
            else if(arr[mid] < x){
                ans = mid;
                start = mid+1;

            }
        }
        return ans;
    }
}
