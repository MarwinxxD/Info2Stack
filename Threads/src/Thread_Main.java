public class Thread_Main implements Runnable {
    int counter;
    Thread thread;
    Thread thread2;

    public static void main(String[] args) {
        new Thread_Main().start();
    }

    public Thread_Main () {
        start();
        counter = 0;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread2 = new Thread(this);
            thread.start();
            thread2.start();
            System.out.println(counter);
        }
    }

    public void stop() {
        if (thread != null) {
            thread.interrupt();
            thread2.interrupt();
            thread = null;
            thread2 = null;
            System.out.println(counter);
        }
    }

    @Override
    public void run() {
        while (!thread.isInterrupted()) {
            try {
                thread.sleep(1000);
                counter++;
                System.out.println(counter);
                if (counter == 10) {
                    thread.interrupt();
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}