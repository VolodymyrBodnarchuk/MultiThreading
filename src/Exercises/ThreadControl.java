package Exercises;

import java.util.concurrent.TimeUnit;

public class ThreadControl{
    public static void main(String[] args) throws InterruptedException {
        //NEW, RUNNABLE, TERMINATED.
        // currentThread() - получаємо потік що триває зараз getName() - получаємо ім'я потоку.
        System.out.println("Hello form "+ Thread.currentThread().getName());
        /* присвоюємо змінній t реалізацію Runable через Thread Runable - це,
        * функціональний інтерфес */
        var t = new Thread(() -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
        });
        // getStart() запускає функію t
        System.out.println(t.getName() + " - " +t.getState()); // getState() повертає поточний стан потоку.
        t.start();
        /* затримка 1 секунду */
        TimeUnit.SECONDS.sleep(1);
        System.out.println(t.getName() + " - " +t.getState());
    }
}