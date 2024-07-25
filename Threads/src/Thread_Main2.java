public class Thread_Main2 {

    public static void main(String[] args) {
        System.out.println("start main");

        Thread2 thread = new Thread2(5);
        Thread2 thread2 = new Thread2(10);
        Thread2_InterruptMe interruptMe = new Thread2_InterruptMe();

        if (thread.getPriority() < interruptMe.getPriority()) {
            interruptMe.start();

            thread2.start();

            interruptMe.joiner();
        } else {
            interruptMe.start();

            thread.start();
            thread2.start();
        }

        System.out.println("end main");
    }
}
