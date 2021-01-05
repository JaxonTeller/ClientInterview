package AlgoAndDS;

import java.util.Iterator;

class LinkedList implements Iterable<String>
{
    private Node first=null;
    class Node
    {
        private String data;
        private Node next;
    }

    //add
    public void add(String data)
    {
        Node oldFirst=first;
        first=new Node();
        first.data=data;
        first.next=oldFirst;
    }

    //delete
    public String delete()
    {
        String data=first.data;
        first=first.next;
        return data;
    }

    //iterate
    public void displayLinkedList()
    {
        Node current=first;
        while (current!=null)
        {
            System.out.println("Data "+current.data);
            current=current.next;
        }

    }

    //using iterable


    @Override
    public Iterator<String> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<String>
    {
        private Node current=first;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public String next() {
            String data=current.data;
            current=current.next;
            return data;
        }
    }

    //reverse a linked list
    private Node reverseLinkedList()
    {
        Node current=first;
        Node previous=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public void displayReverseLinkedList()
    {
        Node node = reverseLinkedList();
        while(node!=null)
        {
            System.out.println("Data "+node.data);
            node=node.next;
        }
    }

    public void deleteNthNode(int n)
    {
        if(first==null)
            System.out.println("Empty");

        if(n > getSize())
            System.out.println("Can't be more than size");

        if(n==1)
        {
            first=first.next;
        }

        int count=1;
        Node nthNode=null;
        Node current=first;
        Node previous=null;
        while (current!=null)
        {
            if(count==n)
            {
                nthNode=current;
                break;
            }
            else
                count++;
            previous=current;
            current=current.next;
        }
        Node next=current.next;
        previous.next=next;
    }

    private int getSize() {
        int size=0;
        while (first!=null)
        {
            size+=1;
            first=first.next;
        }
        return size;
    }
}
public class LinkedListAndReverseItOp {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("Nishikant");
        linkedList.add("Akhilesh");
        linkedList.add("Kishor");
        linkedList.add("Tayade");

        linkedList.displayLinkedList();

        /*linkedList.delete();
        linkedList.delete();

        linkedList.displayLinkedList();*/

        /*linkedList.displayReverseLinkedList();*/

        linkedList.deleteNthNode(3);

        /*Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Data "+iterator.next());
        }*/

        linkedList.displayLinkedList();


    }
}
