package ArrayQuestions;

import java.util.stream.IntStream;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,5};
        System.out.println("length "+array.length);
        int totalCount= array[array.length-1];
        int expectedSum= totalCount*(totalCount+1)/2;
        System.out.println("Expected Sum "+expectedSum);

        int actualSum=0;
        for (int i = 0; i < array.length; i++) {
            actualSum+=array[i];
        }
        System.out.println("Missing element "+(expectedSum-actualSum));

        //Practice
        int n=array[array.length-1];
        int expectedSum1= n *(n+1)/2;
        int actualSum1 = IntStream.of(array).sum();
        System.out.println("Missing element "+(expectedSum1-actualSum1));

    }
}
