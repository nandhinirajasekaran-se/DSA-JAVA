package DSA.Searching.Exercise;

import java.util.Vector;

public class RepeatElements {
    static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args){
        System.out.println(repeatElement(new int[]{1,2,3,3,4}).toString());
    }

    private static Pair repeatElement(int[] arr) {
        Pair pair = new Pair(-1,-1);
        long count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
                pair = new Pair(arr[i],count);
            }else{
                count=0;
            }
        }
        return pair;
    }

    static Pair sequence(Vector<Long> a) {

        // if array has no repeating element, we return (-1,-1).
        if (a.size() - (a.get(a.size() - 1) - a.get(0)) == 1) {
            return new Pair(-1l, -1l);
        }

        int s = 0;
        int e = a.size() - 1;

        // using binary search to find the repeating element.
        while (s < e) {
            int m = (s + e) / 2;

            // if arr[m]=m+a[0], there is no repeating
            // number in [s..m].
            if (a.get(m) >= m + a.get(0)) s = m + 1;

                // else there is repeating number in [s..m].
            else
                e = m;
        }
        // returning the repeated element and its frequency.
        return new Pair(a.get(s), a.size() - (a.get(a.size() - 1) - a.get(0)));
    }

    public static Pair findRepeating(long arr[], int n) {
        Vector<Long> vec = new Vector<>();
        for (long num : arr) {
            vec.add(num);
        }
        Pair p = sequence(vec);
        return p;
    }
}
