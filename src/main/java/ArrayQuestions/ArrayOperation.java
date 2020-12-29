package ArrayQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ArrayOperation {
    public static void main(String[] args) {
        int arr[]=new int[]{3,2};

        for (int i = 0; i < arr.length-1; i++) {

            if(i%2==0)
            {
                if(arr[i+1] < arr[i])
                {
                   int temp=arr[i+1];
                   arr[i+1]=arr[i];
                   arr[i]=temp;
                }
            }
            else
            {
               if(arr[i] < arr[i+1])
               {
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
               }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }



}
