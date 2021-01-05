package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task2CPUExtensive implements Runnable
{
    private int i;

    Task2CPUExtensive(int i)
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
        System.out.println("Data "+this.i+" "+"With Thread :"+Thread.currentThread().getName());
    }
}
class Task2IOExtensive implements Runnable
{
    private int i;

    Task2IOExtensive(int i)
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
        System.out.println("Data "+this.i+" "+"With Thread :"+Thread.currentThread().getName());
    }
}
public class IdealThreadCountInPool {
    public static void main(String[] args) {
        //ideally the no of threads=no of core, as there will be no context switching, no ideal time for thread
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors "+availableProcessors);
        ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);
        for (int i = 0; i < 49; i++) {
            executorService.submit(new Task2CPUExtensive(i));
        }

        executorService.shutdown();

        //because for IO operations, threads may wait, so in a pool of task, there may be no thread to fetch the task
        //hence we will create more threads than cores.
        ExecutorService executorService1 = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            executorService1.submit(new Task2IOExtensive(i));
        }

        executorService1.shutdown();
    }

}
