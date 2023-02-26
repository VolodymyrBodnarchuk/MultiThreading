package Exercises;

import java.util.concurrent.TimeUnit;

public class DeadB {
    public static void main(String[] args) throws InterruptedException {
        var s1 = new Stats();
        var s2 = new Stats(); // екземплря, instances
        var t1 = new Thread(() -> { // 1 Thread
            synchronized (s1){    // синхроніується по s1 виклкикає s2.increment
                sleepSeconds(1);
                s2.increment();
            }
    });
        var t2 = new Thread(() -> { // 2 Theard
            synchronized (s2){    // синхроніується по s2 виклкикає s1.increment
                s1.increment();
            }
        });
        var statePrinter = new Thread(() -> {
            while (true) {
                System.out.println(t1.getState());
                System.out.println(t2.getState());
                sleepSeconds(1);
            }
        });
        statePrinter.start();
        t1.start(); // Start
        t2.start();
        t1.join(); // join
        t2.join();
    }

    public static void sleepSeconds(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
