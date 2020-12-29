package StringQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Anagrams {
    public static void main(String[] args) {
        String str1="anagram";
        String str2="maragana";

        if(str1.equalsIgnoreCase(str2))
            System.out.println("Anagrams");
        else
        {
            IntStream chars1 = str1.toLowerCase().chars();
            IntStream chars2 = str2.toLowerCase().chars();
            if(Arrays.equals(chars1.toArray(),chars2.toArray()))
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");

        }

    }
}
