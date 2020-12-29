package StringQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String string="abcad";
        Map<Character,Integer> charcCountMap=new LinkedHashMap<>();
        for (char c:
             string.toCharArray()) {
            charcCountMap.put(c, charcCountMap.containsKey(c) ? charcCountMap.get(c)+1 : 1);
        }
        Character key = charcCountMap.entrySet().stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println(key);
    }
}
