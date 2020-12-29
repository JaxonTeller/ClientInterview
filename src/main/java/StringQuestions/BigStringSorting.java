package StringQuestions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class BigStringSorting {
    public static void main(String[] args) {
        String[] strings=new String[]{"31415926535897932384626433832795","1","3","10","3","5"};

        Arrays.sort(strings,(x,y)->x.length()==y.length() ? x.compareTo(y) : Integer.compare(x.length(),y.length()));


        //selection sort
        for (int i = 0; i < strings.length; i++) {
            int min=i;
            for (int j = i+1; j < strings.length; j++) {
                if(less(new BigInteger(strings[j]),new BigInteger(strings[min])))
                    min=j;
            }
            exchange(strings,min,i);
        }
        display(strings);
    }
    //compare
    public static boolean less(Comparable firstValue,Comparable secondValue)
    {
        return firstValue.compareTo(secondValue) < 0;
    }
    //exchange
    public static void exchange(Comparable[] array,int firstIndex,int secondIndex)
    {
        Comparable swap=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=swap;
    }
    //display
    public static void display(Comparable[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
