package StringQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedWordInParagraph {
    public static void main(String[] args) {
        String somepara="big black bug bit a big black dog on his big black nose";
        String[] s = somepara.split(" ");
        Set<String> stringSet=new HashSet<>();
        for (String str:
             s) {
            if(!stringSet.add(str))
            {
                System.out.println("First repeated is "+str);
                break;
            }
            else
                stringSet.add(str);
        }
    }
}
