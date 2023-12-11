package Threads_task.task_3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) throws InterruptedException {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        fruits.join();
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        veges.join();
    }

    private static void getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        berries.join();
    }
}

