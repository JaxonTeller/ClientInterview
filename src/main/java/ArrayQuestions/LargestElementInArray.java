package ArrayQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,17,4,15,8};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

        int asInt = IntStream.of(arr).sorted().skip(arr.length - 2).findFirst().getAsInt();
        System.out.println(asInt);


    }
}
