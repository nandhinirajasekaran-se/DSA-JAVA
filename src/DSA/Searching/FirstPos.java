package DSA.Searching;

public class FirstPos {
    public static void main(String[] args){
        System.out.println(firstPos(new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170},9));
    }

    private static int firstPos(int[] arr, int num) {
        int l=0,r=1;
        while (arr[r] <num){
            int temp = r+1;
            r = r+ (r-l+1)*2;
            l = temp;
        }
        return binarySearch1(arr,num,l,r);
    }

    private static int binarySearch1(int[] arr, int x, int l,int r) {
        int mid = (l+r)/2;
        if(arr[mid] > x){
            return binarySearch1(arr,x,l,mid);
        }
        if(arr[mid]==x) {
            return mid;
        }
        return binarySearch1(arr,x,mid+1,r);
    }
}
