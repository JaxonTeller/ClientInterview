package AlgoAndDS;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] array=new Integer[]{2,1,3,5,4,12,11,14};
        System.out.println(isSorted(array));

        //for round
        for (int i = 0; i < array.length; i++) {
            //for comparing two elements
            for (int j = 0; j < array.length-1; j++) {
                if(less(array[j+1],array[j]))
                    exchange(array,(j+1),j);
            }
        }

        System.out.println(isSorted(array));
        display(array);

    }
    //compare
    public static boolean less(Comparable a,Comparable b)
    {
        return a.compareTo(b) < 0;
    }
    //exchange
    public static void exchange(Comparable[] array, int first, int second)
    {
        Comparable swap=array[first];
        array[first]=array[second];
        array[second]=swap;
    }
    //display
    public static void display(Comparable[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    //is Sorted
    public static boolean isSorted(Comparable[] array)
    {
        for (int i = 1; i < array.length; i++) {
            if(less(array[i],array[i-1] ))
                return false;
        }
        return true;
    }
}
