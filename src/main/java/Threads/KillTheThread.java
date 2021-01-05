package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class NewTask implements Runnable
{
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted())
        {
            System.out.println("Something..");
        }
    }
}
public class KillTheThread {
    public static void main(String[] args) {
        /*Thread thread=new Thread(()->{
           while (!Thread.currentThread().isInterrupted())
           {
               System.out.println("Something");
           }
        });
        thread.start();

        //after 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        //try to kill the thread
        thread.interrupt();*/


        Thread thread=new Thread(new NewTask());
        thread.start();

        /*Another solution is to use scheduled thread pool*/
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(()->{
            thread.interrupt();
        },2L, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
