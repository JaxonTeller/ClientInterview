package AlgoAndDS;

class QueueUsingLinkedList
{
    private Node first,last;

    class Node{
        private String data;
        private Node next;
    }

    public boolean isEmpty()
    {
        return first==null ? true : false;
    }

    public void enqueue(String data)
    {
        Node oldlast=last;
        last=new Node();
        last.data=data;
        last.next=null;
        if(isEmpty())
        {
            first=last;
        }
        else
        {
            oldlast.next=last;

        }
    }

    public String dequeue()
    {
        if(isEmpty())
        {
            last=null;
            return null;
        }
        String data=first.data;
        first=first.next;
        return data;
    }

    public void display()
    {
        while(first!=null)
        {
            System.out.println("Data "+first.data);
            first=first.next;
        }

    }
}
public class QueueOpUsingLL {
    public static void main(String[] args) {

        QueueUsingLinkedList queueUsingLinkedList=new QueueUsingLinkedList();
        queueUsingLinkedList.enqueue("Nishu");
        queueUsingLinkedList.enqueue("Gishu");
        queueUsingLinkedList.enqueue("Moshu");

        System.out.println(queueUsingLinkedList.dequeue());
        queueUsingLinkedList.display();

    }
}
