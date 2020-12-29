package Threads;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ProducerForBQ implements Runnable
{
    private BlockingQueue<Integer> blockingQueue;
    private int maxSize;

    public ProducerForBQ(BlockingQueue<Integer> blockingQueue, int maxSize) {
        this.blockingQueue = blockingQueue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
       while (true)
       {
           while (blockingQueue.size()!=maxSize)
           {
               Random random=new Random();
               int i = random.nextInt();
               System.out.println("Producer producing "+i);
               try {
                   blockingQueue.put(i);
               } catch (InterruptedException exception) {
                   exception.printStackTrace();
               }
           }

       }
    }
}
class ConsumerForBQ implements Runnable
{
    private BlockingQueue<Integer> blockingQueue;

    public ConsumerForBQ(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true)
        {
            try {
                System.out.println("Consumer consuming "+blockingQueue.take());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new LinkedBlockingQueue<>();
        Thread thread=new Thread(new ProducerForBQ(blockingQueue,10));
        Thread thread1=new Thread(new ConsumerForBQ(blockingQueue));

        thread.start();
        thread1.start();
    }
}
