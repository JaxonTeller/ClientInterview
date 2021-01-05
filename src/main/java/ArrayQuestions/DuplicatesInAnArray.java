package ArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesInAnArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,2,4,15,8};

        Set<Integer> integers=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
           if(!integers.add(arr[i]))
               System.out.println("Duplicate element "+arr[i]);
        }

        Arrays.sort(arr);
        StringBuilder duplicates=new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1])
                duplicates.append(String.valueOf(arr[i]));
        }
        System.out.println(duplicates.toString());


        List<Integer> collect = IntStream.range(1, arr.length).sorted().map(i -> {
            if (arr[i] == arr[i - 1])
                return arr[i];
            return -1;
        }).filter(i -> i > 0).boxed().collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
