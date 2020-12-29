package ArrayQuestions;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,5};
        int totalCount= array[array.length-1];
        int expectedSum= totalCount*(totalCount+1)/2;
        System.out.println("Actual Sum "+expectedSum);

        int actualSum=0;
        for (int i = 0; i < array.length; i++) {
            actualSum+=array[i];
        }
        System.out.println("Missing element "+(expectedSum-actualSum));

        //Multiple missing element

    }
}
