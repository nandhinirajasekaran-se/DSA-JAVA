package DSA.Searching.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoRepeatedArray {
    public static void main(String[] args){
       // System.out.println(Arrays.toString(twoRepeatedValues(6,new int[]{1,2,4,5,1,2})));
        System.out.println(Arrays.toString(twoRepeat(6,new int[]{1,2,4,5,1,2})));
        System.out.println(Arrays.toString(twoRepeat(4,new int[]{1,2,2,1})));
    }

    private static int[] twoRepeat(int n,int[] arr){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> rep = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                rep.add(arr[i]);
                if(rep.size()==2)
                    break;
            }else {
                set.add(arr[i]);
            }
        }
        return rep.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int[] twoRepeatedValues(int n, int[] arr) {

        Arrays.sort(arr);
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i=0;i<n;i++){
            if( i==0 || (arr[i-1]<arr[i])){
                int result = countNum(arr[i],arr );
                if(result!=-1)
                    lst.add(result);
            }
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int countNum(int num, int[] arr) {
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if((mid < arr.length-1  && arr[mid]==num && arr[mid+1]==num )|| (mid > 0 && arr[mid-1]==num && arr[mid]==num))
                return arr[mid];
            else if(arr[mid]>num){
                end = mid-1;
            }else{
                start = start+1;
            }
        }
        return -1;
    }
}
