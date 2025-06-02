package DSA.Searching.Exercise;

public class SquareRoot {
    public static void main(String[] args){
        System.out.println(squareRoot1(1));
    }

    private static int squareRoot1(int num) {
        if(num==1 || num==0)
            return num;
        int start =0,end=num/2, ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if( mid*mid == num){
                return num;
            }else if(mid*mid > num){
                end = mid-1;
            }else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
