package StringQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class MinNumbeOfDeletion {
    public static void main(String[] args) {
        String s="AAAA";
        StringBuilder stringBuilder=new StringBuilder(s);
        int deleteCount=0;
        for (int i = 1; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i-1)==stringBuilder.charAt(i))
            {
                deleteCount+=1;
            }
        }
        System.out.println(deleteCount);
    }
}
