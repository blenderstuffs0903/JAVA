public class RunnableThreading implements Runnable {
    Thread td;
    public RunnableThreading() {
        td = new Thread(this, "Demo");
        System.out.println("Child Thread");
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class RunnableThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); // create a new thread
        nt.td.start(); // Start the thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
