
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations



        Thread thread1 = new Thread(new MyRunnable("PANG"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        // join makes our main thread waits for these two threads to finish and then executes the rest
        thread1.join();
        thread2.join();

        System.out.println("GAME OVER!");






    }

}
