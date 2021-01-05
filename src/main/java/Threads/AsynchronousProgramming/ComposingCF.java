package Threads.AsynchronousProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComposingCF {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        number(executorService)
                //.thenApply(data->inc(data,executorService))
                .thenCompose(data->inc(data,executorService))
                .thenAccept(data-> System.out.println(data));
    }

    public static CompletableFuture<Integer> number(ExecutorService executorService)
    {
        return CompletableFuture.supplyAsync(()->2,executorService);
    }

    public static CompletableFuture<Integer> inc(int number,ExecutorService executorService)
    {
        return CompletableFuture.supplyAsync(()->number+1,executorService);
    }
}
