import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadTest {

    public static void task() {
        try {
            Thread.sleep(1000);

        }   catch (Exception e) {

        }
    }

    private static final int THREAD_POOL_SIZE = 100;

    private static final Executor executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    public static void main(String[] args) {

        // 순차 프로그래밍
//        IntStream.range(0, 100).forEach(i -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println(threadName + ": task start " + i);
//            task();
//            System.out.println(threadName + ": task completed " + i);
//        });

        // 병렬 프로그래밍
        IntStream.range(0,100).forEach(i -> executor.execute(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + ": task start " + i);
            task();
            System.out.println(threadName + ": task completed " + i);
        }));

    }
}
