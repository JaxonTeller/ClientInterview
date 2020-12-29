package StringQuestions;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MarsExploration {
    public static void main(String[] args) {
        String s="SOSSOSSOS";
        int parts  = s.length() / 3;
        final AtomicInteger counter = new AtomicInteger(0);
        Collection<String> strings = s.chars()
                .mapToObj(i -> String.valueOf((char)i) )
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / 3
                        ,Collectors.joining()))
                .values();
        int sos = (int) strings.stream().filter(s1 -> !s1.equals("SOS")).count();
        System.out.println(sos);
    }
}
