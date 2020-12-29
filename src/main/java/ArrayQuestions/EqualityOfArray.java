package ArrayQuestions;

public class EqualityOfArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,17,4,15,8};
        int arr2[]=new int[]{1,2,2,17,4,15,8};

        if(arr.length!= arr2.length)
            System.out.println("Not Equal");

        boolean equalOrNot=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr2[i])
            {
                equalOrNot=true;
            }
            else
            {
                equalOrNot=false;
                break;
            }
        }
        System.out.println(equalOrNot);

    }
}
