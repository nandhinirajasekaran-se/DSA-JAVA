package practise;

import java.security.KeyStore;
import java.util.*;

record Pair(int first, int second) {}

public class CustomLogic {
    public static void main(String[] args){

        int[][] data = { {1,3}, {2,2}, {4,5} };
        Arrays.sort(data, Comparator.comparingInt((int[] a)-> a[1]).reversed());
        Arrays.stream(data).forEach(e-> Arrays.stream(e).forEach(System.out::print));

        System.out.println("\n");
        List<Pair> pairs = new ArrayList<>( List.of(
                new Pair(1,4),new Pair(1,2), new Pair(5,6)));

        pairs.sort(Comparator.comparingInt(Pair::second));
        pairs.stream().forEach(e->{
            System.out.println(e);
        });

        pairs.sort(Comparator.comparingInt(Pair::second).reversed());
        pairs.stream().forEach(e->{
            System.out.println(e);
        });

        pairs.sort(Comparator.comparingInt(Pair::first).thenComparing(Pair::second));
        pairs.stream().forEach(e-> System.out.println(e));

        pairs.sort(Comparator.<Pair>comparingInt(p-> p.second()%2).thenComparing(Pair::second).thenComparing(Pair::first).reversed());

        Map<String, Integer> freq = Map.of("a", 3, "b", 1, "c", 5, "d", 2);
        freq.entrySet().stream().sorted(Comparator.<Map.Entry<String,Integer>>comparingInt(Map.Entry::getValue).reversed()
                .thenComparing(Map.Entry::getKey));
        freq.entrySet().forEach(e-> System.out.println(e));
    }
}
