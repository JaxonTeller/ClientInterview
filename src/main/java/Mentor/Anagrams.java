package Mentor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class Anagrams {
    public static void main(String[] args) {
        String str1="LISTEN";
        String str2="SILENT";

        //Using Streams
        if(str1.equalsIgnoreCase(str2))
            System.out.println("Anagrams");
        else {
            IntStream chars1 = str1.toLowerCase().chars();
            IntStream chars2 = str2.toLowerCase().chars();
            if(Arrays.equals(chars1.toArray(), chars2.toArray()))
                System.out.println("Anagrams");
            else
                System.out.println("Not anagrams");
        }

        //Using Hashmap
        Map<Character,Integer> charCountMap=new HashMap<>();
        for (Character c:
             str1.toCharArray()) {
            charCountMap.put(c, charCountMap.containsKey(c) ? charCountMap.get(c)+1 : 1);
        }
        for (Character c:
             str2.toCharArray()) {
            charCountMap.put(c,charCountMap.containsKey(c) ? charCountMap.get(c)-1 : 1);
        }

        Optional<Map.Entry<Character, Integer>> anyEntry =
                charCountMap.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue() > 0).findAny();

        anyEntry.ifPresentOrElse(System.out::println,()->{
            System.out.println("Anagrams");
        });
    }
}
