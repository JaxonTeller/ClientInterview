package ArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;

public class ThirdLargestNumberInArray {
    public static void main(String[] args) {
        int array[]=new int[]{1,5,3,6,2,7,9};
       /* Arrays.sort(array);
        System.out.println(array[array.length-3]);

        //or
        OptionalInt first = IntStream.of(array).sorted().skip(array.length - 3).findFirst();
        System.out.println(first.getAsInt());

        //or
        Set<Integer> integers=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            integers.add(array[i]);
        }
        System.out.println("Size "+integers.size());
        integers.forEach(System.out::println);
        System.out.println(integers.size()-1);
*/

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if(largest < array[i])
            {
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=array[i];
            }
            else if(secondLargest < array[i] && array[i]!=largest)
            {
                thirdLargest=secondLargest;
                secondLargest=array[i];
            }
            else if(thirdLargest < array[i]&&array[i]!=secondLargest)
            {
                thirdLargest=array[i];
            }
        }
        System.out.println("Third Largest "+thirdLargest);
    }
}
