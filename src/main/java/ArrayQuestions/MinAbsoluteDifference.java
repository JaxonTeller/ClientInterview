package ArrayQuestions;


import java.util.Arrays;
import java.util.stream.IntStream;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,3,2,4};
        Arrays.sort(arr);
        int sum = IntStream.range(1, arr.length).map(i -> arr[i] - arr[i - 1]).sum();
        System.out.println(sum);
    }
}
