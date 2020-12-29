package AlgoAndDS;

public class InsertionSortWithPrintCriteria {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6,8,3};
        //Insertion sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(less(arr[j],arr[j-1]))
                    exchange(arr,(j-1),j);
                else
                    break;
            }
        }
      //  display(arr);
    }
    public static boolean less(int firstValue,int secondValue)
    {
        return Integer.valueOf(firstValue).compareTo(Integer.valueOf(secondValue)) < 0;
    }
    public static void exchange(int[] array,int firstValue,int secondValue)
    {
        int swap=array[firstValue];
        array[firstValue]=array[secondValue];
        array[secondValue]=swap;

    }
    public static void display(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
}
