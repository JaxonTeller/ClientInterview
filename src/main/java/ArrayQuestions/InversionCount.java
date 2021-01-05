package ArrayQuestions;

public class InversionCount {
    public static void main(String[] args) {
        int inversionCount=0;
        int arr[]=new int[]{2,4,1,3,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                    inversionCount++;
            }
        }
        System.out.println(inversionCount);
    }
}
