package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task3 implements Runnable
{
    private int i;

    Task3(int i)
    {
        this.i=i;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Task to be executed after 10 seconds by "+Thread.currentThread().getName());
    }
}
public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        //one-off task, only once after certain time
        scheduledExecutorService.schedule(new Task3(10),10L,TimeUnit.SECONDS);

        //fixed rate-- wait for 15sec as initial delay, then run after every 10sec
        scheduledExecutorService.scheduleAtFixedRate(new Task3(10),15L,10,TimeUnit.SECONDS);

        //fixed delay--run after 10sec of completion of prev task
        scheduledExecutorService.scheduleWithFixedDelay(new Task3(10),15L,10L,TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
