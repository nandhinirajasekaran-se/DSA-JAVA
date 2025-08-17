package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class RollingWindowTransaction {
    public static void main(String[] args){
        int n = 7, k = 2, T = 60;
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.computeIfAbsent(100, x -> new ArrayList<>()).add(0);
        map.computeIfAbsent(100, x -> new ArrayList<>()).add(20);
        map.computeIfAbsent(100, x -> new ArrayList<>()).add(59);
        map.computeIfAbsent(200, x -> new ArrayList<>()).add(10);
        map.computeIfAbsent(200, x -> new ArrayList<>()).add(100);
        map.computeIfAbsent(100, x -> new ArrayList<>()).add(61);
        map.computeIfAbsent(200, x -> new ArrayList<>()).add(65);

        TreeSet<Integer> spikers = new TreeSet<>();
        for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
            List<Integer> eList = e.getValue();
            if(eList.size()<2){
                continue;
            }
            Collections.sort(eList);
            int l=0;
            for(int i=0;i<eList.size();i++){
                while (eList.get(i) - eList.get(l) >T)
                    l++;
                if(i-l+1>=k){
                    spikers.add(e.getKey());
                    break;
                }
            }
        }

        spikers.stream().forEach(integer -> System.out.println(integer));
    }

}
