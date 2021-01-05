package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task4 implements Runnable
{
    private int i;

    Task4(int i)
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
        System.out.println("Data :"+i+" "+"Executed by"+Thread.currentThread().getName());
    }
}
public class SingleThreadPool {
    public static void main(String[] args) {
        //as only one thread is there the task will be executed sequentially, in the same manner as task are added in the queue
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task4(i));
        }
        executorService.shutdown();
    }
}
