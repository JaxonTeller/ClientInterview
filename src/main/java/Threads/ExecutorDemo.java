package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
    private int taskId;

    Task(int taskId)
    {
        this.taskId=taskId;
    }

    @Override
    public void run() {
        System.out.println("Task "+taskId+" "+Thread.currentThread().getName());
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task(i));
        }
    }
}
