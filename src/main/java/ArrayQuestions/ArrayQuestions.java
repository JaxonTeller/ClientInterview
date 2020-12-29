package ArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayQuestions {
    public static void main(String[] args) {
        int arr[]=new int[]{47498, 14526, 74562, 42681, 75283, 45796};
        int otherArr[]=new int[]{1,2,3,4,5};
        /*Find duplicates elements in an array*/
        Set<Integer> integers=new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(arr).filter(n -> !integers.add(n)).boxed().collect(Collectors.toSet());
        System.out.println(duplicates);
        System.out.println(integers);

        /*Find second largest element in an array*/
        OptionalInt secondLargest = Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst();
        System.out.println(secondLargest.getAsInt());

        /*Check if arrays are equals*/
        System.out.println(Arrays.equals(arr,otherArr));



    }
}
