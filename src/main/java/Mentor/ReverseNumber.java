package Mentor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=23431;
        int reversed=0;
        while (number!=0)
        {
            int digit=number%10;
            reversed=reversed*10 + digit;
            number=number/10;
        }
        System.out.println(reversed);
    }
}
