package StringQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringQuestions {
    public static void main(String[] args) {
        String str="YYYTTYY";
        Character[] characters = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Map<Character, Long> collect = Arrays.stream(characters).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        String collect3 = collect.keySet().stream().filter(character -> !(collect.get(character) > 2)).
                map(String::valueOf).collect(Collectors.joining());

        System.out.println(collect3);

    }
}
