package Threads;

import java.util.concurrent.TimeUnit;

class Counter implements Runnable
{
    private int c=0;

    public void increment()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        c=c+1;
    }

    public void decrement()
    {
        c=c-1;
    }

    public int getC() {
        return c;
    }

    @Override
    public void run() {
        synchronized (this)
        {
            this.increment();
            System.out.println("Value of c after incrementing "+this.getC()+" "+"incremented by "+Thread.currentThread().getName());

            this.decrement();
            System.out.println("Value of c after decrementing "+this.getC()+" "+"decremented by "+Thread.currentThread().getName());
        }

        /*If not synchronized race condition*/

//        this.increment();
//        System.out.println("Value of c after incrementing "+this.getC()+" "+"incremented by "+Thread.currentThread().getName());
//
//        this.decrement();
//        System.out.println("Value of c after decrementing "+this.getC()+" "+"decremented by "+Thread.currentThread().getName());
    }
}
public class RaceCondition {
    public static void main(String[] args) {
      Counter counter=new Counter();
      Thread thread=new Thread(counter);
      Thread thread1=new Thread(counter);
      Thread thread2=new Thread(counter);

      thread.start();
      thread1.start();
      thread2.start();
    }
}
