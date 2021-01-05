package JavaTopicalQuestions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Entry<K,V>
{
    private K key;
    private V value;
    private Entry<K,V> next;
}
class CustomHashmap<K,V>
{
    private int intialCapacity=16;
    private Entry[] entryArray;

    public CustomHashmap()
    {
        this.entryArray=new Entry[intialCapacity];
    }
    public CustomHashmap(int intialCapacity)
    {
        this.intialCapacity=intialCapacity;
        this.entryArray=new Entry[this.intialCapacity];
    }
    //put
    public void put(K key,V value)
    {
        int index=index(key);
        Entry newEntry=new Entry(key,value,null);
        Entry entry = entryArray[index];
        if(entry==null)
        {
            entryArray[index]=newEntry;
        }
        else
        {
            Entry<K,V> previousNode=null;
            Entry<K,V> currentNode=entryArray[index];
            while(currentNode!=null)
            {
                if(currentNode.getKey().equals(key))
                {
                    currentNode.setValue(value);
                    break;
                }
                previousNode=currentNode;
                currentNode=currentNode.getNext();
            }
            if(previousNode!=null)
            {
                previousNode.setNext(newEntry);
            }
        }
    }

    //get
    public V get(K key)
    {
        V value=null;
        int index = index(key);
        Entry entry = entryArray[index];
        while (entry!=null)
        {
            if(entry.getKey().equals(key))
            {
                 value = (V) entry.getValue();
                 break;
            }
            entry=entry.getNext();
        }
        return value;
    }

    private int index(K key) {
        return key==null ? 0 : key.hashCode()%this.intialCapacity;
    }

    public void display()
    {
        for (int i = 0; i < entryArray.length; i++) {
            Entry entry = entryArray[i];
            while (entry!=null)
            {
                System.out.println("Data : "+"Key :"+entry.getKey()+"Value :"+ entry.getValue());
                entry=entry.getNext();
            }
        }
    }
}
public class  CustomHashMapImplementation {
    public static void main(String[] args) {
        CustomHashmap<String,String> map=new CustomHashmap<>();
        map.put("Nishikant","Tayade");
        System.out.println(map.get("Nishikant"));
    }
}





















