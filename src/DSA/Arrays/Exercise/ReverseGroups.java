package DSA.Arrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseGroups {
    public static void reverseGroups(int[] arr,int k){

        if(k>arr.length) {
            k = arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(i<(k-1)){
                int temp = arr[k-1-i];
                arr[k-1-i] = arr[i];
                arr[i]= temp;
            }else if(i>(k-1)){
                int temp=arr[arr.length-1-i+k];
                arr[arr.length-1-i+k]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseGroupsList( ArrayList<Integer> arr,int k){

        if(k>arr.size()) {
            k = arr.size();
        }
        for(int i=0;i<arr.size()-1;i++){
            if(i<(k-1)){
                int temp = arr.get(k-1-i);
                arr.set(k-1-i,arr.get(i));
                arr.set(i,temp);
            }else if(i>(k-1)){
                int temp = arr.get(arr.size()-1-i+k);
                arr.set(arr.size()-1-i+k,arr.get(i));
                arr.set(i,temp);
            }
        }System.out.println(arr);
    }
    public static void main(String[] args){
        //reverseGroups(new int[]{1,2,3,4,5},3);
        //reverseGroups(new int[]{9,8,6,5},5);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(35,56,48,21,87));
        reverseGroupsList(arr,77);
        System.out.println(arr.size());
        ArrayList<Integer> list = Arrays.stream(new int[]{9,8,6,5})
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
