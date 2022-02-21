package mythread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new MyTask(1));
        executorService.execute(new MyTask(2));
        executorService.execute(new MyTask(3));
        executorService.execute(new MyTask(4));
        executorService.execute(new MyTask(5));

        executorService.shutdown();
    }
}
