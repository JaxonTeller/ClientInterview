package Threads;

class Demo extends Thread
{
    @Override
    public void run() {
        System.out.println("Demo thread running..");
    }
}
class AnotherDemo implements Runnable
{
    @Override
    public void run() {
        System.out.println("AnotherDemo thread running..");
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        Thread thread=new Thread(new AnotherDemo());
        thread.start();

        Thread thread1=new Thread(new Demo());
        thread1.setDaemon(true);
        thread1.start();

        Thread thread2=new Thread(()->{
            System.out.println("Using lambdas to create thread..");
        });
        thread2.start();
    }
}
