import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class DemoApp {
    public static void main(String[] args) {
        //Fork
        int[] arr = {4,3,2,6,7,8,7,66,32};
        System.out.println(Arrays.toString(arr));
        ForkJoinPool.commonPool();

//        int threadsInCommonPool = Runtime.getRuntime().availableProcessors() - 1;
//        System.out.println("Threads in common pool:" + threadsInCommonPool);
//        var myPoll = new ForkJoinPool(4);
//        myPoll.commonPool().invoke(new MergeSortTask(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
