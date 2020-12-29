package Threads;

class CreateFile implements Runnable
{
    @Override
    public void run() {
        System.out.println("Creating a file");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("File has been created");
    }
}
class DownloadsFile implements Runnable
{
    @Override
    public void run() {
        System.out.println("Downloading a file");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("File has been downloaded");
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread=new Thread(new CreateFile());
        Thread thread1=new Thread(new DownloadsFile());

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Operation successfully completed");
    }
}
