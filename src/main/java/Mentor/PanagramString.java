package Mentor;

import java.util.HashSet;
import java.util.Set;

public class PanagramString {
    public static void main(String[] args) {
        String str="We promptly judged antique ivory buckles for the next prize";
        String toLowerCase = str.toLowerCase();
        Set<Integer> alphabetCount=new HashSet<>();
        for (int i = 0; i < toLowerCase.length(); i++) {
            int place=(int)toLowerCase.charAt(i);
            alphabetCount.add(place);
        }

        if(alphabetCount.size()==26)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
    }
}
