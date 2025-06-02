package DSA.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RangeNum {
    static void rangeNum(int[] l, int[] r){
        int maj = 0,count =0, len=0;

        for (int i=0;i<l.length;i++){
            len += r[i]-l[i]+1;
        }

        int[] arr = new int[len];
        for(int i=0;i<l.length;i++){
            for(int j=l[i];j<=r[i];j++){
                arr[count++] = j;
            }
        }
        Map<Integer, Long> map = Arrays.stream(arr).boxed().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue(Comparator.naturalOrder())).get().getKey());
        Map<Integer,Long> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map1.entrySet().stream().findFirst().get().getKey());

    }
    static int maxOccurred(int[] l,int[] r){
        int[] freq = new int[100];
        int maxi=-1;
        for(int i=0;i< l.length;i++){
            freq[l[i]] += 1;
            freq[r[i]+1] -= 1;
            if(r[i] > maxi)
                maxi= r[i];
        }
        int msum = freq[0];
        int ind=0;
        for(int i=1;i<maxi;i++){
            freq[i] += freq[i-1];
            if(msum<freq[i]){
                msum=freq[i];
                ind=i;
            }
        }
        return ind;
    }
    public static void main(String[] args){
     rangeNum(new int[]{1, 4, 3, 1}, new int[]{15, 8, 5, 4});
     rangeNum(new int[]{1, 5, 9, 13, 21}, new int[]{15, 8, 12, 20, 24});
     System.out.println(
             maxOccurred(new int[]{1, 5, 9, 13, 21}, new int[]{15, 8, 12, 20, 24}));
    }
}
