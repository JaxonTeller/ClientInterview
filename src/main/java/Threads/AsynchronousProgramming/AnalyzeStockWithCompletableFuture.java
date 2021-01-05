package Threads.AsynchronousProgramming;


import java.util.concurrent.*;

class AnalyzeStockCreateFile
{
    public CompletableFuture<String> call(ExecutorService executorService) {

      return CompletableFuture.supplyAsync(()->{
          try {
              TimeUnit.SECONDS.sleep(2);
          } catch (InterruptedException exception) {
              exception.printStackTrace();
          }
          System.out.println("Analyzing stock");
          return "Stock Analyze file has been created";
      },executorService);
    }
}
public class AnalyzeStockWithCompletableFuture {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        AnalyzeStockCreateFile analyzeStockCreateFile=new AnalyzeStockCreateFile();
        CompletableFuture<String> completableFuture = analyzeStockCreateFile.call(executorService);

        CompletableFuture<Void> file_received =
                completableFuture.thenAccept((String file) -> System.out.println("File received"))
                .thenRun(()-> System.out.println("Send User Notification"));

        System.out.println("Keep showing some other things");

        executorService.shutdown();
    }
}
