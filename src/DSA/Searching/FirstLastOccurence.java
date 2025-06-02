package DSA.Searching;

public class FirstLastOccurence {
    public static void main(String[] args){
        int firocc= firstOcc(new int[]{1,2,2,2,3},2,0,5);
        int lastocc= lastOcc(new int[]{1,2,2,2,3},2,0,5);

        System.out.println(firocc);
        System.out.println(lastocc);
        System.out.println(lastocc-firocc+1);


    }

    private static int firstOcc(int[] arr, int x, int l, int r) {
        int mid = (l+r)/2;
        if(arr[mid]>x){
            return firstOcc(arr,x,mid,r);
        }else if(arr[mid] == x && arr[mid-1] < x){
            return mid;
        }else if(arr[mid] == x && arr[mid-1] >= x){
            return firstOcc(arr,x, l-mid < 0 ? l+1 : l-mid ,mid+1);
        } else {
            return firstOcc(arr,x,l,mid);
        }
    }
    private static int lastOcc(int[] arr, int x, int l, int r) {
        int mid = (l+r)/2;
        if(arr[mid]>x){
            return lastOcc(arr,x,mid,r);
        }else if(arr[mid] == x && arr[mid+1] > x){
            return mid;
        }else if(arr[mid] == x && arr[mid+1] <= x){
            return lastOcc(arr,x,l+1, mid+1);
        } else {
            return lastOcc(arr,x,l,mid);
        }
    }

}
