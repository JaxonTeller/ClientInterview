package AlgoAndDS;

public class InsertionSort {
    public static void main(String[] args) {
        Integer array[]=new Integer[]{2,1,4,32,11,12,17,19};
        System.out.println(isSorted(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(less(array[j],array[j-1]))
                    exchange(array,j,j-1);
                else
                    break;
            }
        }
        System.out.println(isSorted(array));
        display(array);
    }
    //compare
    public static boolean less(Comparable a,Comparable b)
    {
        //means a is less than b
        return a.compareTo(b) < 0;
    }

    //exchange
    public static void exchange(Comparable[] array,int j,int jminone)
    {
        Comparable swap=array[jminone];
        array[jminone]=array[j];
        array[j]=swap;
    }
    //is Sorted
    public static boolean isSorted(Comparable[] array)
    {
        for (int i = 1; i < array.length; i++) {
            if(less(array[i], array[i-1]))
                return false;
        }
        return true;
    }
    //display
    public static void display(Comparable[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
