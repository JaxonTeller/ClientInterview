package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    public static void main(String[] args) {
        DeadlockExample deadlockExample=new DeadlockExample();

        final A a = deadlockExample.new A();
        final B b = deadlockExample.new B();

        Lock lock=new ReentrantLock();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                synchronized (a)
                {

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }

                    synchronized (b)
                    {
                        System.out.println("In Block 1");
                    }
                }


            }
        };

        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                 synchronized (b)
                 {
                     synchronized (a)
                     {
                         System.out.println("In block 2");
                     }
                 }
            }
        };

        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable1);

        thread.start();
        thread1.start();
    }

    private class A
    {
        int a=10;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    private class B
    {
        int a=20;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }
}
