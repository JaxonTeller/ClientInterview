package ArrayQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class FindRepeatedNumbersInArray {
    public static void main(String[] args) {
        int[] array=new int[]{1,1,2,3,3,4,4,5,5};
        Map<Integer,Integer> elementCountMap=new HashMap<>();
        for (int element:
             array) {
            elementCountMap.put(element, elementCountMap.containsKey(element) ? elementCountMap.get(element)+1 : 1);
        }

        List<Integer> collect = elementCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);


        Optional<Integer> first =
                elementCountMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst();
        System.out.println(first.orElseThrow());
    }
}
