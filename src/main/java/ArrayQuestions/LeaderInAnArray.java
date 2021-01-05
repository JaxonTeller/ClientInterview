package ArrayQuestions;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,0};
        boolean isLeader=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j])
                {
                    isLeader=false;
                    break;
                }
                else {
                    isLeader=true;
                    continue;
                }
            }
            if(isLeader)
                System.out.println(arr[i]);
        }
    }
}
