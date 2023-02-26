package Exercises;

import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args){
        var executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> System.out.println("Hello"));
        executor.shutdown();
    }
}
