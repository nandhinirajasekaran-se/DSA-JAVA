package DSA.Arrays.Exercise;

public class ArrayRotatedSorted {
    public static void main(String[] args){
        System.out.println(check123(new int[]{4,5,1,2,3}));
        System.out.println(check123(new int[]{8,9,1,2,3}));
        System.out.println(check123(new int[]{7,5,1,2,3}));

    }

    private static boolean check123(int[] arr) {
        int n=arr.length, incCount=0,decCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[(i+1)%n])
                incCount++;
            else if(arr[i]>arr[(i+1)%n])
                decCount++;
        }
        return ((incCount==1 && decCount==n-1) || (incCount==n-1 && decCount==1));
    }


}
