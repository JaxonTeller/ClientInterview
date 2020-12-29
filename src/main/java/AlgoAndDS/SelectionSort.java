package AlgoAndDS;

import java.util.Arrays;
import java.util.function.IntFunction;

public class SelectionSort {
    public static void main(String[] args) {
        Integer array[]= new Integer[]{2,1,32,33,12,21};
        System.out.println(isSorted(array));

        for (int i = 0; i < array.length; i++) {
            int min=i;
            for (int j = i+1; j < array.length; j++) {
                if(compare(array[j], array[min]))
                {
                    min=j;
                }
            }
           exchange(array,min,i);
        }
        display(array);
        System.out.println(isSorted(array));
    }
    public static boolean compare(Comparable a,Comparable b)
    {
      return a.compareTo(b) < 0;
    }
    public static void exchange(Comparable[] a,int min, int i)
    {
        Comparable swap=a[min];
        a[min]=a[i];
        a[i]=swap;

    }
    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++) {
            if(compare(a[i],a[i-1]))
                return false;
        }
        return true;
    }

    public static void display(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
