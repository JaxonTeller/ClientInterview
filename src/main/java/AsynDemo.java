import java.sql.Time;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//order=pizz+coke
public class AsynDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        System.out.println("If he/she anything");
        System.out.println("Gave recepit");

        CompletableFuture<String> pizza = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Pizz ready!";
        },executorService);


        CompletableFuture<String> coke = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.MINUTES.sleep(2);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Coke ready!";
        },executorService);

        pizza.thenCombine(coke,(pizzaa,cokke)->"Order is ready")
                .thenAccept(System.out::println);

        executorService.shutdown();
    }
}
