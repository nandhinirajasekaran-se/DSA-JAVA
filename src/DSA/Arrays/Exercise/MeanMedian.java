package DSA.Arrays.Exercise;

import java.util.Arrays;
import java.util.Map;

public class MeanMedian {
    public static int median(int A[],int N)
    {

        Arrays.sort(A);

        int index = N%2==0 ? (N/2 -1) : (((N-1)/2));
        System.out.println("index:"+index+":"+ Math.round(N/2));
        return A[index];
        //Your code here
        //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public static int mean(int A[],int N)
    {
        //Your code here
        int sum=0;
        for (int i=0;i<N;i++){
            sum += A[i];
        }return sum/N;
    }
    public static void main(String[] args){
       // System.out.println(mean(new int[]{1,2,3,4,5,6},6));
        //System.out.println(median(new int[]{1,2,3,4,5,6},6));

        //System.out.println(mean(new int[]{2,8,3,4},4));
        System.out.println(median(new int[]{2,8,3,4},4));

       // System.out.println(mean(new int[]{1,2,19,28,5},5));
        System.out.println(median(new int[]{1,2,19,28,5},5));
    }
}
