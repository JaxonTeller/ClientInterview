package StringQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Panagram {
    public static void main(String[] args) {
        String checkForPanagram="We promptly judged antique ivory buckles for the next prize 123";
        String toLowerCase = checkForPanagram.toLowerCase();
        Set<Integer> integers=new HashSet<>();
        for (int i = 0;  i < toLowerCase.length(); i++) {
            int place=(int)toLowerCase.charAt(i);
            if(Character.isAlphabetic(place))
            {
                integers.add(place);
            }
        }
        if(integers.size()==26)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");

    }
}
