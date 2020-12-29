package ArrayQuestions;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]=new int[]{4, 5, 4, 5, 4, 6};
        Arrays.sort(arr);
        int missingValue=-1;
        for (int i = 0; i < arr.length; i++) {
            int numericValue =arr[i];
            int nextValue=numericValue+1;
            if(arr[i+1]!=nextValue)
            {
                missingValue=nextValue;
                break;
            }

        }
        System.out.println(missingValue);
    }
}
