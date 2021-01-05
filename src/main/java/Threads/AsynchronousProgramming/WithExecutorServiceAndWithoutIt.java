package Threads.AsynchronousProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WithExecutorServiceAndWithoutIt {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Running future task in "+Thread.currentThread());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Success value";
        },executorService);

        future.thenAccept(System.out::println);

        System.out.println("Do something else in main thread");

        executorService.shutdown();
    }
}
