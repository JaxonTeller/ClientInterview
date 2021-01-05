package ArrayQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoArrayPairSum {
    public static void main(String[] args) {
        int[] array=new int[]{1,4,5,6,6};
        int[] array2=new int[]{3,5,8,2,9};
        int sum=9;

        Map<Integer,Integer> pairMap=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array[i]+array2[j]==sum)
                    pairMap.put(array[i],array2[j]);
            }
        }
        pairMap.entrySet().stream().forEach(System.out::println);
    }
}
