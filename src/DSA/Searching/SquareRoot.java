package DSA.Searching;

public class SquareRoot {
    public static void main(String[] args){
        System.out.println(squareRoot(9));
    }

    private static int squareRoot(int i) {
        int start =0, end =i/2, ans=0;
        while (start<=end){
            int mid = (start+end)/2;
            if(mid*mid == i){
                return mid;
            }
            if(mid*mid <i){
                start=start+1;
                ans=mid;
            }else {
                end = mid-1;
            }
        }return ans;
    }
}
