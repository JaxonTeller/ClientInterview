package ArrayQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestInArray {
    public static void main(String[] args) {
        int[] array=new int[]{1,4,11,45,36,21,9};

        //Using arrays
//        Arrays.sort(array);
//        System.out.println(array[array.length-3]);

        //Using collection
        List<Integer> collect = Arrays.asList(array).stream().flatMapToInt(ints -> IntStream.of(ints)).boxed().collect(Collectors.toList());
        Collections.sort(collect);
        System.out.println(collect.get(collect.size()-3));

        //Using Streams to find 3rd largest
        OptionalInt first = Stream.of(array).flatMapToInt(ints -> IntStream.of(ints)).sorted().skip(array.length-3).findFirst();
        System.out.println(first);
        //or
        OptionalInt first1 = IntStream.of(array).sorted().skip(array.length - 3).findFirst();
        System.out.println(first1);

        //Using Streams to find max
        int asInt = IntStream.of(array).max().getAsInt();
        System.out.println(asInt);

        int asInt1 = IntStream.of(array).min().getAsInt();
        System.out.println(asInt1);



    }
}
