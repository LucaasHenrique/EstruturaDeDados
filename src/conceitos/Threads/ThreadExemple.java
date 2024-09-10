package conceitos.Threads;

public class ThreadExemple implements Runnable{

    String threadName;

    public ThreadExemple (String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.threadName + " value " + i);
        }
    }
}

