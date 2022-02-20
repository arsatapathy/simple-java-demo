package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;

        for (int i =0; i< 10; i++) {
            executorService.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " started" +  " Active Thread Count : " + pool.getActiveCount());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println(Thread.currentThread().getName() + " completed." + " Active Thread Count : " + pool.getActiveCount());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();

    }
}
