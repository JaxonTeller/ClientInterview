package ArrayQuestions;

public class SmallestElementInUnSortedArray {
    public static void main(String[] args) {
        int[] array=new int[]{4,3,3,13,9,5};
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min)
                min=array[i];
        }
        System.out.println(min);

        //largest and smallest both
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largest)
                largest=array[i];
            else if(array[i] < smallest)
                smallest=array[i];
        }
        System.out.println("Largest "+largest+" "+"Smallest "+smallest);

    }
}
