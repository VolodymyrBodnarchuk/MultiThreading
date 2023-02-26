package Exercises;/*в цьому коді описано проблему неконсостентності
* для того щоб два потоки не */



public class inconsistent {
    public static void main(String[] args) throws InterruptedException {
        var stats = new Stats();
        Runnable incrementLogic = () -> { // логіка яку використовують обидва потоки
            for(int i = 0;i<10_000;i++){
                stats.increment();  // якщо помилка то в методі
            }
        };
        var t1 = new Thread(incrementLogic);
        var t2 = new Thread(incrementLogic);
        t1.start();// для того щоб поточний потік(в якому ми працюємо ) почекав
        t2.start();// коли закінчуться інші потоки
        t1.join(); // ми використовуємо join
        t2.join();
        System.out.println(stats.counter());
    }
}
