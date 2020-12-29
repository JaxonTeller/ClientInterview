package Threads;

class SleepDemo implements Runnable
{
    @Override
    public  void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
public class ThreadSuspensionEx {
    public static void main(String[] args) {
        Thread thread=new Thread(new SleepDemo());
        thread.setPriority(10);
        thread.start();

        Thread thread1=new Thread(new SleepDemo());
        thread1.start();
    }
}
