package ArrayQuestions;

import java.util.Arrays;

public class ArrayContainsElement {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,15,4,21,13};

        //if not sorted
        int elementToBeFound=2;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==elementToBeFound)
            {
                System.out.println("found at index "+i);
                break;
            }
        }

        Arrays.sort(array);
        //if sorted then can perform binary search because O(logn)
        int low=0;
        int high= array.length-1;
        while (low <= high)
        {
            int middle= low +(high-low)/2;

            if(array[middle]==elementToBeFound)
                System.out.println("Element present at index "+middle);

            if(array[middle] < elementToBeFound)
                low=middle+1;
            else
                high=middle-1;
        }

    }
}
