package JavaTopicalQuestions;

import java.util.*;

public class ImmutableCollections {
    public static void main(String[] args) {

        List<String> names = List.of("Nishikant", "Kishor", "Tayade");
        //names.add("Yogesh");

        List<String> otherNames=new ArrayList<>();
        otherNames.add("Yogesh");
        otherNames.add("Mangesh");
        List<String> otherNamesUnmodifiableList = Collections.unmodifiableList(otherNames);
        //otherNamesUnmodifiableList.add("Nishikant");
        otherNames.add("Rajesh");
        otherNamesUnmodifiableList.forEach(System.out::println);

       /* Similarly you can have
        Collections.unmodifiableSet();
        Collections.unmodifiableMap();*/

       /* Set.of();
        Map.of();*/

    }
}
