package concurrency;

public class RunnableImplementaion {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
