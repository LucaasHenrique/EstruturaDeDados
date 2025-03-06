package conceitos.Threads;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        ThreadExemple threadExemple = new ThreadExemple("Thread 1");
        ThreadExemple threadExemple2 = new ThreadExemple("Thread 2");
        ThreadExemple threadExemple3 = new ThreadExemple("Thread 3");

        Thread thread1 = new Thread(threadExemple);
        Thread thread2 = new Thread(threadExemple2);
        Thread thread3 = new Thread(threadExemple3);

        thread1.start();
        thread2.start();
        thread3.start();

//        thread1.join();
//        thread2.join();
//        thread3.join();

        // Main thread
        for (int i = 0; i < 100; i++) {
            System.out.println("Main thread | valor atual do loop: " + i);
        }
    }
}
