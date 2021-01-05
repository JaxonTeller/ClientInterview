package Threads;

class Singleton
{
    private static Singleton singletonInstance=null;

    private Singleton()
    {

    }

    public static  Singleton getSingletonInstance()
    {
        synchronized (Singleton.class)
        {
            if(singletonInstance==null)
            {
                singletonInstance=new Singleton();
                return singletonInstance;
            }
            return singletonInstance;
        }

        /*Gives race condtion check then act pattern*/
//            if(singletonInstance==null)
//            {
//                singletonInstance=new Singleton();
//                return singletonInstance;
//            }
//            return singletonInstance;

    }
}
public class SingletonExample {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println(Singleton.getSingletonInstance());
        });

        Thread thread1=new Thread(()->{
            System.out.println(Singleton.getSingletonInstance());
        });

        thread.start();
        thread1.start();
    }
}
