package mythread;

public class MyTask implements Runnable {
    int task;

    public MyTask(int task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-Task-" + task + "-Subtask-" + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
