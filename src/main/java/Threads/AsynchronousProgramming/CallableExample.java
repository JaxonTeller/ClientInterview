package Threads.AsynchronousProgramming;

import java.util.concurrent.*;

class ServentPerformSomeTask implements Callable
{
    @Override
    public String call() throws Exception {
        System.out.println("Going to look for the best paneer");
        TimeUnit.SECONDS.sleep(5);
        return "With the best paneer ever";
    }
}
public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> placeHolderForPaneer = executorService.submit(new ServentPerformSomeTask());

        while(!placeHolderForPaneer.isDone())
        {
            //perform some other task
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Lunch time "+placeHolderForPaneer.get());

    }
}
