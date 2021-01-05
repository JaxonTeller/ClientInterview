import java.util.*;
import java.util.function.Function;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Client interview preparation..");

        Map<String,String> stringStringMap=new TreeMap<>(String::compareTo);
        stringStringMap.put("Nishikant","Tayade");
        stringStringMap.put("Hishikant","Jayade");
        stringStringMap.put("Jishikant","Vayade");
        stringStringMap.put("Uishikant","Gayade");

        stringStringMap.keySet().stream().forEach(System.out::println);


        System.out.println("-------------------------------------------------------------------------");

        Map<String,String> stringStringMap1=new TreeMap<>(Collections.reverseOrder());
        stringStringMap1.put("Nishikant","Tayade");
        stringStringMap1.put("Hishikant","Jayade");
        stringStringMap1.put("Jishikant","Vayade");
        stringStringMap1.put("Uishikant","Gayade");

        stringStringMap1.keySet().stream().forEach(System.out::println);


    }

}
