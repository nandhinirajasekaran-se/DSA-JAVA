package practise;

import java.util.*;

public class TopologicalScheduling {
    public static void main(String[] args){
        int m = 4, p = 3;
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<m;i++){
            g.add(new ArrayList<>());
        }
        int[] indeg = new int[m];
        Arrays.fill(indeg,0);
        indeg[1]++;
        indeg[3]++;
        indeg[2]++;

        g.get(0).add(1);
        g.get(1).add(2);
        g.get(0).add(3);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<m;i++)
            if(indeg[i]==0) q.add(i);

        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()){
            int u = q.poll();
            list.add(u);
            for(int v: g.get(u)){
                if(--indeg[v]==0)
                    q.add(v);
            }

        }
        if (list.size() != m) System.out.println("CYCLE");
        else System.out.println(list.toString().replaceAll("[\\[\\],]", "").trim());
    }
}
