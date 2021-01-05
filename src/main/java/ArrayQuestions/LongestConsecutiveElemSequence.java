package ArrayQuestions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestConsecutiveElemSequence {
    public static void main(String[] args) {
        int array[]=new int[]{2,0,6,1,5,3,7};
        /*Arrays.sort(array);
        int longestConsecutiveSubsequence=1;
        for (int i = 1; i < array.length; i++) {
            int prevElement=array[i]-1;
            if(array[i-1]==prevElement)
                longestConsecutiveSubsequence++;
            else
                break;
        }
        System.out.println(longestConsecutiveSubsequence);*/


        //using set
        Set<Integer> collect = IntStream.of(array).boxed().collect(Collectors.toSet());
        collect.forEach(System.out::println);

    }
}
