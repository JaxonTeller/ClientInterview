package Threads.AsynchronousProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;

public class ExceptionHandlingInCF {
    public static void main(String[] args) {
//    doSomethingWhichThrowsException(Executors.newFixedThreadPool(1)).
//            thenAccept(data-> System.out.println("Resolved "+data));

    doSomethingHandleGeneric(Executors.newFixedThreadPool(2)).
            thenAccept(data-> System.out.println("Resolved "+data));
    }

    //either return data or exception
    public static CompletableFuture<String> doSomethingWhichThrowsException(ExecutorService executorService)
    {
        return CompletableFuture.supplyAsync(()->{
            int balance=0;
            if(balance==0)
                throw new IllegalArgumentException("Illegal Argument to API");
            else
                return "Some output";
        },executorService).exceptionally(ex->{
            System.out.println("Excpetion occured "+ex.getMessage());
            return "Exceptional Case";
        });
    }

    //more generic method for the same
    public static CompletableFuture<String> doSomethingHandleGeneric(ExecutorService executorService)
    {

        return CompletableFuture.supplyAsync(()->{
            int balance=0;
            if(balance==0)
                throw new IllegalArgumentException("Illegal Argument to API");
            else
                return "Some output";
        },executorService).handle((string,ex)->{
            if(ex!=null)
            {
                ex.printStackTrace();
                return "Exception occured";
            }
            return string;
        });
    }
}
