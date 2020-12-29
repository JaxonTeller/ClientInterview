package CollectionFramework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
class Entry<K,V>
{
    private K key;
    private V value;
    private Entry<K,V> nextEntry;
}
class CustomHashMap<K,V>
{
    //Settings: HashMap is array of Entry objects
    private int capacityOfArray=16;
    private Entry<K,V> entryArray[];

    public CustomHashMap()
    {
        entryArray=new Entry[capacityOfArray];
    }
    public CustomHashMap(int capacityOfArray)
    {
        this.capacityOfArray=capacityOfArray;
        this.entryArray=new Entry[this.capacityOfArray];
    }
    //Put
    public void put(K key,V value)
    {
        /*First calculate index*/
        int index=index(key);
        Entry<K,V> entry=new Entry<K, V>(key,value,null);
        /*Now go to that index in entry array and check if there is any entry already present*/
        if(entryArray[index]==null)
        {
            /*Add that entry to that index*/
            entryArray[index]=entry;
        }
        else
        {
            /*Here means there are some entries already present at index, in entry array*/
            Entry<K,V> previousNode=null;
            Entry<K,V> currentNode=entryArray[index];
            while(currentNode!=null)
            {
                /*First check for overwriting the value if keys are same*/
                if(currentNode.getKey().equals(key))
                {
                    currentNode.setValue(value);
                    break;
                }
                previousNode=currentNode;
                currentNode=currentNode.getNextEntry();
            }
            if(previousNode!=null)
            {
                previousNode.setNextEntry(entry);
            }
        }
    }
    //Get
    public V get(K key)
    {
        V value=null;
        /*First thing is finding index so that we can go to entry array and fetch the value*/
        int index = index(key);
        Entry<K, V> entry = entryArray[index];
        while (entry!=null)
        {
            if(entry.getKey().equals(key))
            {
                value=entry.getValue();
                break;
            }
            entry=entry.getNextEntry();
        }
        return value;
    }

    //remove


    //calculate hash then index
    private int index(K key) {
        return key==null?0:Math.abs(key.hashCode()%capacityOfArray);
    }

    public void display(){
        for(int i = 0; i < capacityOfArray; i++){
            if(entryArray[i] != null){
                Entry<K, V> currentNode = entryArray[i];
                while (currentNode != null){
                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    currentNode = currentNode.getNextEntry();
                }
            }
        }
    }
}
public class CustomHashMapImplementation {
    public static void main(String[] args) {

        CustomHashMap<String,String> customHashMap=new CustomHashMap<String, String>();
        customHashMap.put("Nishu","Tayade");
        customHashMap.put("Golu","Tayade");
        customHashMap.put("Nishu","Jayade");
        customHashMap.display();

    }
}
