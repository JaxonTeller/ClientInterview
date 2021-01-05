package ArrayQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RearrangeTheArray {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6};
        int temp;
        for (int i = 0; i < array.length; i++) {
            if(i%2==0)
            {
                 temp=array[array.length-1];
                //shit the element to the right
                for (int j = array.length-2; j >=i ; j--) {
                    array[j+1]=array[j];
                }
                array[i]=temp;
            }

        }
        IntStream.of(array).forEach(System.out::println);
    }
}
