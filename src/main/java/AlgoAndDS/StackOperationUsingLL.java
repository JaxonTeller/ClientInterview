package AlgoAndDS;

import java.util.Iterator;

class StackUsingLinkedList implements Iterable<String>{

    private Node first=null;

    @Override
    public Iterator<String> iterator() {
        return new StackUsingLLIterator();
    }

    private class StackUsingLLIterator implements Iterator<String>
    {
        private Node current=first;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public String next() {
            String data = current.data;
            current=current.next;
            return data;
        }
    }

    class Node{
        String data;
        Node next;
    }

    public void push(String data)
    {
        Node oldFirst=first;
        first=new Node();
        first.data=data;
        first.next=oldFirst;
    }

    public String pop()
    {
        String data=first.data;
        first=first.next;
        return data;
    }

    public boolean isEmpty()
    {
        return first==null? true : false;
    }

    public void display()
    {
        while (first!=null)
        {
            System.out.println("Data "+first.data);
            first=first.next;
        }
    }

    public void displayFromGivenRef(Node position)
    {
        while (position!=null)
        {
            System.out.println("Reversed data "+position.data);
            position=position.next;
        }
    }

    public Node reverseLinkedList()
    {
        //take three ref/pointers
        Node current=this.first;
        Node previous=null;
        Node next=null;
        while(current!=null)
        {
            //next should point to next element
            next=current.next;
            //delete the forward link
            current.next=previous; //i.e null
            previous=current;
            current=next;
        }
        return previous;
    }
}
public class StackOperationUsingLL
{
    public static void main(String[] args) {
      StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
      stackUsingLinkedList.display();

        stackUsingLinkedList.push("Nishikant");
        stackUsingLinkedList.push("Nishi");
        stackUsingLinkedList.push("NishiK");
        stackUsingLinkedList.push("NishiMant");
        stackUsingLinkedList.push("NishiLant");

        //System.out.println(stackUsingLinkedList.pop());

//        Iterator<String> iterator = stackUsingLinkedList.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

        StackUsingLinkedList.Node node = stackUsingLinkedList.reverseLinkedList();
        stackUsingLinkedList.displayFromGivenRef(node);
    }
}

