package StringQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class TwoString {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";

//        List<Character> collect = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//        List<Character> collect1 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//
//        if(collect.stream().anyMatch(character -> collect1.contains(character)))
//            System.out.println("YES");
//        else
//            System.out.println("No");

       if(s1.chars().anyMatch(i -> s2.chars().anyMatch(i1 -> i1==i)))
           System.out.println("YES");
        else
            System.out.println("No");

    }
}
