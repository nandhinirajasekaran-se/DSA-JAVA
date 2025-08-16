package practise;

import org.w3c.dom.css.Counter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewFeatures {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Java", "Python", "JavaScript", "c++");
        //filter(names, (str)-> str.startsWith("J"));

        System.out.println("Words in Uppercase ");
        //        Converter<String, String> upperCaseConverter = String::toUpperCase;
        List<String> upperCase = names.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        upperCase.stream().forEach(System.out::println);

        System.out.println("Words start with J ");
        names.stream()
                .filter(e->e.startsWith("J")).forEach(System.out::println);


        List<String> nums = Arrays.asList("100", "200", "300", "400","400");

        System.out.println("Words in number ");
        //        Converter<String, Integer> stringToInteger = Integer::valueOf;
        List<Integer> numbers = nums.stream().map(Integer::valueOf).collect(Collectors.toList());
        numbers.stream().forEach(System.out::println);

        System.out.println("Sum : "+ numbers.stream().reduce(0,Integer::sum));

        System.out.println("Sum : "+ numbers.stream().collect(Collectors.summingDouble(e->e)));

        System.out.println("MAX : " + numbers.stream().max((e1,e2)-> e1>e2 ? 1: -1).get());
        System.out.println("MIN : " + numbers.stream().min((e1,e2)-> e1>e2 ? 1: -1).get());
        System.out.println("count : " + numbers.stream().count());

        //Map<Integer, Integer> map = numbers.stream().collect(Collectors.toMap(e, e->e));
        Map<Integer, Integer> map = IntStream.range(0,numbers.size()).boxed()
                .collect(Collectors.toMap(i->i,numbers::get ));
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));

        Map<Integer, Long> freq = numbers.stream().
                collect(Collectors.groupingBy(i->i, Collectors.counting()));
        freq.entrySet().stream().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));


    }

    private static void filter(List<String> names, Predicate<String> condition){
        for( String name : names){
            if(condition.test(name))
                System.out.println(name);
        }
    }


}
