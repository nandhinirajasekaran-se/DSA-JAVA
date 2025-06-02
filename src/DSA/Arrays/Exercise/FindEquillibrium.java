package DSA.Arrays.Exercise;

public class FindEquillibrium {
    public static void main(String[] args){
        //System.out.println(findEq(new int[]{1,2,0,3}));
        //System.out.println(findEq(new int[]{1,1,1,1}));
        System.out.println(findEq(new int[]{-7, 1, 5, 2, -4, 3, 0}));
    }

    private static int findEq(int[] arr) {
        int index=0, leftSum=0,rightsum=0,n=arr.length;
        for(int i=0;i<n;i++){
            rightsum +=arr[i];
        }
        for(int i=0;i<n;i++){
            rightsum -=arr[i];
            if(leftSum == rightsum){
                index=i;
                break;
            }
            leftSum += arr[i];
        }
        return (index==0) ? -1: index;
    }
}
