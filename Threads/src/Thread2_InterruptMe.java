public class Thread2_InterruptMe extends Thread {

    public Thread2_InterruptMe() {
        setPriority(10);
    }

    @Override
    public void run() {
        System.out.println("start InterruptingMe");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end InterruptingMe");
    }

    public void joiner() {
        Thread2 thread = new Thread2(5);

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
