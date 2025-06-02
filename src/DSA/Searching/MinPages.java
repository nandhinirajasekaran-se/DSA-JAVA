package DSA.Searching;

public class MinPages {
    public static void main(String[] args){
        System.out.println(findPages(new int[]{12,34,67,90},4,2));
    }

    private static boolean isPossible(int[] arr, int n, int m, int currMin){
        int studentReq = 1;
        int currSum =0;
        for(int i=0;i<n;i++){
            currSum += arr[i];
            if(currSum> currMin){
                studentReq++;
                currSum = arr[i];
            }
        }
        return studentReq<=m;
    }
    private static int findPages(int[] arr, int n, int m){
        int sum=0;
        if(n<m)
            return -1;

        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        int start = arr[n-1], end=sum, result=Integer.MAX_VALUE;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (isPossible(arr,n,m,mid)){
                result = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return result;

    }
    private static int minPages(int[] arr, int k,int n) {
        if (k==1)
            return sumPages(arr,0,n-1);

        if (n==1)
            return arr[0];

        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            res = Math.min(res, Math.max(minPages (arr,i,k-1), sumPages(arr,i,n-1)));
        }
        return res;
    }

    private static int sumPages(int[] arr, int start, int end) {
        int sum=0;
        for(int i=start;i<end;i++){
            sum +=arr[i];
        }
        return sum;
    }
}
