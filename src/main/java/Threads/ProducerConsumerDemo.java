package Threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer implements Runnable
{
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
       while (true)
       {
           synchronized (queue)
           {
               while (queue.size()==maxSize)
               {
                   System.out.println("Queue is full..waiting on consumer to consume");
                   try {
                       queue.wait();
                   } catch (InterruptedException exception) {
                       exception.printStackTrace();
                   }
               }
               Random random=new Random();
               int i = random.nextInt();
               System.out.println("Producing value "+i);
               queue.add(i);
               queue.notifyAll();
           }
       }
    }
}
class Consumer implements Runnable
{
    private Queue<Integer> queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
     while (true)
     {
         synchronized (queue)
         {
             while (queue.isEmpty())
             {
                 System.out.println("Queue is empty..waiting on producer to produce");
                 try {
                     queue.wait();
                 } catch (InterruptedException exception) {
                     exception.printStackTrace();
                 }
             }
             System.out.println("Consuimg value "+queue.remove());
             queue.notifyAll();
         }

     }
    }
}
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Thread thread=new Thread(new Producer(queue,10));
        Thread thread1=new Thread(new Consumer(queue));

        thread.start();
        thread1.start();
    }
}
