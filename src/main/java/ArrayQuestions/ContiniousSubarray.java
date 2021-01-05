package ArrayQuestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContiniousSubarray {
    public static void main(String[] args) {
        int[] array=new int[]{3,4,-7,1,3,3,1,-4};
        int sum=7;
        for (int i = 0; i < array.length; i++) {
            int sum_so_far=0;
            for (int j = i; j < array.length; j++) {
                sum_so_far+=array[j];
                if(sum_so_far==sum)
                    print(array,i,j);
            }
        }
    }

    private static void print(int[] array, int i, int j) {
        System.out.println(IntStream.range(i,j+1)
        .mapToObj(i1 -> array[i1])
        .collect(Collectors.toList()));
    }
}
