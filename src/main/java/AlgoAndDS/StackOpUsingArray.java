package AlgoAndDS;

import java.util.Iterator;

class StackUsingArray implements Iterable<String>
{
    private String[] strings;
    private int N=0;
    private int capacity;

    public StackUsingArray(int capacity)
    {
        this.capacity=capacity;
       this.strings=new String[capacity];
    }

    public void push(String data)
    {
        if(strings.length==this.capacity)
            resize(2 * this.capacity);
        strings[N++]=data;
    }

    private void resize(int newCapacity) {
        String copy[]=new String[newCapacity];
        for (int i = 0; i < strings.length; i++) {
            copy[i]=strings[i];
        }
        strings=copy;
    }

    public String pop()
    {
        return strings[--N];
    }
    public boolean isEmpty()
    {
        return N==0? true :false;
    }

    @Override
    public Iterator<String> iterator() {
        return new StackUsingArrayIterator();
    }

    private class StackUsingArrayIterator implements Iterator<String>
    {
        private int i=N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public String next() {
            return strings[--i];
        }
    }
}
public class StackOpUsingArray {
    public static void main(String[] args) {
     StackUsingArray stackUsingArray=new StackUsingArray(3);


     stackUsingArray.push("Nishi");
     stackUsingArray.push("Nisu");
     stackUsingArray.push("Nihu");
     stackUsingArray.push("Vishal");
     System.out.println(stackUsingArray.pop());

        Iterator<String> iterator =
                stackUsingArray.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
