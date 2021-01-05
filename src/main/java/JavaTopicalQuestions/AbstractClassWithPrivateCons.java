package JavaTopicalQuestions;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

abstract class AA
{
    private AA()
    {

    }
}
//Normal rule private cons means the class cant be extended
/*class BB extends AA
{

}*/
public class AbstractClassWithPrivateCons {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Nishikant");
        names.add("Kishor");
        names.add("Tayade");
        names.add("Kishor");
        //names.forEach(System.out::println);

        Collections.reverse(names);
        //names.forEach(System.out::println);

        Set<String> namesSet=new HashSet<>();
        namesSet.add("Nishikant");
        namesSet.add("Nishikant");
        namesSet.add(null);
        //namesSet.forEach(System.out::println);

        Set<String> sortedSet=new TreeSet<>();
        sortedSet.add("Akhilesh");
        sortedSet.add("Akhilesh");
       // sortedSet.add(null);
       // sortedSet.forEach(System.out::println);

        Map<String,String> namesMap=new HashMap<>();
        namesMap.put("Nishikant","Tayade");
        namesMap.put("Shashikant","Tayade");
        namesMap.put("Vikrant","Tayade");
        namesMap.put("Sandanad","Tayade");


        Map<String,String> namesMapTree=new TreeMap<>(Collections.reverseOrder());
        namesMapTree.put("Nishikant","Tayade");
        namesMapTree.put("Shashikant","Tayade");
        namesMapTree.put("Vikrant","Tayade");
        namesMapTree.put("Sandanad","Tayade");
       // namesMapTree.entrySet().forEach(stringStringEntry -> System.out.println("Key "+stringStringEntry.getKey()));

        /*Collections views*/
        Collection<String> values = namesMap.values();
        Set<String> strings = namesMap.keySet();
        Set<Map.Entry<String, String>> entries = namesMap.entrySet();

        /*Synchronized keyword is used on each of the method inside the list*/
        List<String> strings1 = Collections.synchronizedList(names);
        Iterator<String> iterator = strings1.iterator();
        while (iterator.hasNext())
        {
            iterator.remove();
        }
        strings1.forEach(System.out::println);
    }


}
