package Threads_task.task_1;

public class Robot extends Thread {

    Robot(String str) {
        super(str);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(1500);
            System.out.println(Thread.currentThread().getName() + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(Thread.currentThread().getName() + " Stopped");
    }
}
