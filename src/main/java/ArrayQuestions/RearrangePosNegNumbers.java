package ArrayQuestions;

import java.util.Arrays;

public class RearrangePosNegNumbers {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,-4,-1,4};
        for (int i = 0; i < array.length; i++) {
            if(i%2!=0 || i==0)
                {
                    if(array[i] > 0)
                    {
                        for (int j = i+1; j < array.length ; j++) {
                            if(array[j] > 0)
                                continue;
                            else
                            {
                                int temp=array[i];
                                array[i]=array[j];
                                array[j]=temp;
                                break;
                            }
                        }
                    }
                }
            if (i!=0)
            {
                if(i%2==0)
                {
                    if(array[i] < 0)
                    {
                        for (int j = i+1; j < array.length; j++) {
                            if(array[j] < 0)
                                continue;
                            else
                            {
                                int temp=array[i];
                                array[i]=array[j];
                                array[j]=temp;
                                break;
                            }
                        }
                    }
                }
            }
        

        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
