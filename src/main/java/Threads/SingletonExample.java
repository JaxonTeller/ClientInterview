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
    }
}
public class SingletonExample {
}
