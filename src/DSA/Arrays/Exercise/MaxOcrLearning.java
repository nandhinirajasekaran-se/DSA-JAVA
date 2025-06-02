package DSA.Arrays.Exercise;

import java.util.Arrays;

public class MaxOcrLearning {
    public static void main(String[] args){
        System.out.println(maxOcr(3, new int[]{2,1,3}, new int[]{5,3,9}, 9));
        System.out.println(maxOcr(5, new int[]{1,5,9,13,21}, new int[]{15,8,12,20,30}, 30));
        System.out.println(maxOcr(10, new int[]{2,8,5,1,10,5,9,9,3,5},
                new int[]{10,10,6,8,10,10,10,9,6,5}, 10));
    }
    private static int maxOcr(int n, int[] l, int[] r, int max){
        int[] lr = new int[max+2];
        int index=0,sum=0,maxocr=0;
        Arrays.fill(lr,0);
        for(int i=0;i<n;i++){
            lr[l[i]] += 1;
            lr[r[i]+1] -= 1;
        }
        for(int i=0;i<lr.length;i++){
            sum += lr[i];
            if(maxocr < sum){
                index = i;
            }
            maxocr = Math.max(maxocr,sum);
        }
        return index;
    }
}
