package Exercises;

import java.util.concurrent.TimeUnit;

public class primitivs {
    public static void main(String[] args) throws InterruptedException {
        /*
        виведеться BlOCK
        * він робиться через те що,
        * перший потік праює з increment і підключається до synchronized
        * і другий стає в BLOCK і чекає коли звільниться та частинка коду.*/
        var stats = new Stats();
        var t1 = new Thread(stats::increment);
        var t2 = new Thread(stats::increment);
        t1.start();
        t2.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(t2.getState());
        t1.join();
        t2.join();


        // basic multiThreading
        // 1. Class Thread
        // 2. volatile
        // 3. synchronized
        // 4. wait(), notify(), notifyAll()
    }
}
