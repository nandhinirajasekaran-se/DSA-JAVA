package DSA.Searching;

public class MedianOfArray {
    public static void main(String[] args){
        System.out.println(medianSortedArrays(new int[]{1,2,3,4},new int[]{6,7,8,9,11}));
    }

    private static int medianSortedArrays(int[] left, int[] right) {
        int nLeft = left.length;
        int nRight = right.length;

        if(nLeft > nRight){
            medianSortedArrays(right,left);
        }

        int start = 0, end = nLeft, realMid = (nLeft+nRight+1)/2;
        while (start<=end){
            int mid = ( start + end )/2;
            int leftLeftSize = mid;
            int leftRightSize = realMid - mid;
            int leftLeft = (leftLeftSize>0) ? left[leftLeftSize-1] : Integer.MIN_VALUE;
            int leftRight = (leftRightSize>0) ? right[leftRightSize-1] : Integer.MIN_VALUE;

            int rightLeft = leftLeftSize<nLeft ? left[leftLeftSize]: Integer.MAX_VALUE;
            int rightRight = leftRightSize<nRight ? right[leftRightSize]: Integer.MAX_VALUE;

            if(leftLeft <= rightRight && leftRight<= rightLeft){
                if((nLeft+nRight)%2==0)
                    return (Math.max(leftLeft,leftRight)+Math.min(rightLeft,rightRight))/2;

                return Math.max(leftLeft,leftRight);
            }else if(leftLeft > rightRight){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
