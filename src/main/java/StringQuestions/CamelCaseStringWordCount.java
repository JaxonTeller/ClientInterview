package StringQuestions;

import java.util.Arrays;

public class CamelCaseStringWordCount {
    public static void main(String[] args) {
        String str="saveChangesInTheEditor";
        char[] chars = str.toCharArray();
        int upperCaseCharCount=0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i]))
            {
                upperCaseCharCount+=1;
            }
        }
        System.out.println(upperCaseCharCount);
        System.out.println("Total words "+(upperCaseCharCount+1));

    }
}
