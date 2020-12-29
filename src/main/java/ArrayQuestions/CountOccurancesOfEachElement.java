package ArrayQuestions;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CountOccurancesOfEachElement {
    public static void main(String[] args) {
        int arr[]=new int[]{4, 5, 4, 5, 4, 6};
        Map<Integer, Long> collect =
                IntStream.of(arr).mapToObj(i -> i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Long aLong = collect.values().stream().max(Comparator.comparingLong(Long::longValue)).get();
        System.out.println(aLong);
        System.out.println(collect.keySet().stream().filter(key-> collect.get(key)==aLong).findAny());
    }
}
