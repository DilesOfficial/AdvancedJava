// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable{
    public void run(){
        for(int i = 1; i<=2;i++){
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a single PrinterTask object
        PrinterTask obj = new PrinterTask();
        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread t1 = new Thread(obj, "Worker-1");
        Thread t2 = new Thread(obj, "Worker-2");

        // TODO: Start both threads
        t1.start();
        t2.start();


        // TODO: Use join() to wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Thread was interrupted!");
        }
    }
}
