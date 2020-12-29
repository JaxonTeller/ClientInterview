package ArrayQuestions;

public class PairsWhoseSum {
    public static void main(String[] args) {
        int arr[]=new int[]{1, 4, 5, 3, 2, 8, 6};
        int sum=10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==sum)
                    System.out.println("Pair "+arr[i]+"and "+arr[j]);
            }
        }
    }
}
