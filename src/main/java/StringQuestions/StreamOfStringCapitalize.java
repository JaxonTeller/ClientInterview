package StringQuestions;

import java.util.stream.Stream;

public class StreamOfStringCapitalize {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("nishikant", "tayade");
        stream.map(element->Character.toUpperCase(element.charAt(0))+element.substring(1)).forEach(System.out::println);
    }
}
