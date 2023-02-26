package Exercises;

import java.util.concurrent.TimeUnit;
public class Stats{
    private Long counter = 0L;
    // synchronized використовується щоб забороняє двом потокам працювати одночасно.
    // або використовувати якусь функцію одночасно.
    // тому другий потік чекає коли преший закінчить використовувати increment.

    synchronized public void increment() {
        counter++;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public long counter(){
        return counter;
    }
}
