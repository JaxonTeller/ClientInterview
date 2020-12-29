package CollectionFramework;

import java.util.*;
import java.util.function.BiConsumer;

public class CollectionFrameworkConcepts {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Nishu");
        names.add("Golu");
        names.add("Sonu");

        /*Iterators*/
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        iterator.forEachRemaining(System.out::println);


        /*List iterator*/
        ListIterator<String> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext())
        {
            stringListIterator.add("Vivek");
            System.out.println(stringListIterator.next());
        }


        /*Collections and Arrays*/
        Collections.sort(names);
        System.out.println(names);

        /*Set*/
        Set<String> lastNames=new HashSet<>();
        lastNames.add("Nishu");
        lastNames.add("Nishu");
        lastNames.forEach(System.out::println);


        /*Map*/
        Map<String,String> studentSchoolName=new HashMap<>();
        studentSchoolName.put(null,"Subodh");
        studentSchoolName.put(null,"City");
        studentSchoolName.forEach((String studentName,String schoolName)-> System.out.println(studentName+schoolName));


        /*Unmodifiable collection*/
        List<String> unmodifiableList = Collections.unmodifiableList(names);


    }
}
