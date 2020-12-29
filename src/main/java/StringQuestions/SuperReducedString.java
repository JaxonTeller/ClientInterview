package StringQuestions;

public class SuperReducedString {
    public static void main(String[] args) {
        String string="abbb";
        StringBuilder stringBuilder=new StringBuilder(string);
        char[] chars = string.toCharArray();
        for (int i = 1; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i)==stringBuilder.charAt(i-1))
            {
                stringBuilder.delete(i-1,i+1);
                i=0;

            }
        }
        System.out.println(stringBuilder);
    }
}
