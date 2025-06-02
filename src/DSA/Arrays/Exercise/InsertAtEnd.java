package DSA.Arrays.Exercise;

import java.util.Arrays;

public class InsertAtEnd {

    public static void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        //Your code here
        arr[sizeOfArray-1] = element;
        System.out.println(Arrays.toString(arr));
    }
    public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element) {
        System.out.println(Arrays.toString(arr));
           for (int i=sizeOfArray-1;i>index;i--){
               arr[i] = arr[i-1];
           }
        arr[index] = element;
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(int[] arr,int n){

        int i = 0;

        //Increasing all values by (arr[arr[i]]%n)*n to store the new element.
        for(i = 0; i < n; i++)
            arr[i] += ( arr[arr[i]] %n ) *n;


        System.out.println(Arrays.toString(arr));

        //Since we had multiplied each element with n.
        //We will divide by n too to get the new element at that
        //position after rearranging.
        for(i = 0; i < n; i++)
            arr[i] = arr[i]/n;


        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args){
        int[] arr = new int[5];
        int cont=0;
        arr[cont++]=4;
        arr[cont++]=0;
        arr[cont++]=2;
        arr[cont++]=1;
        arr[cont++]=3;
        /*insertAtEnd(arr,6,6);
        insertAtIndex(arr,6,2,90);

        int[] arr1 = new int[5];
        int cont1=0;
        arr1[cont1++]=8;
        arr1[cont1++]=2;
        arr1[cont1++]=7;
        arr1[cont1++]=3;
        insertAtIndex(arr1,5,0,3);*/

        rearrange(arr,5);
    }
}
