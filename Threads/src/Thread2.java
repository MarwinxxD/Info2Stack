public class Thread2 extends Thread {
    int end;
    int counter;

    public Thread2(int end) {
        setPriority(1);
        counter = 0;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println(counter);
        while (!isInterrupted()) {
            try {
                sleep(1000);
                counter++;
                System.out.println(counter);
                if (counter == end) {
                    interrupt();
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
