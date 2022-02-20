package mythread;

public class MyThread {

    static class ThreadExample1 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++)
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    static class ThreadExample2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++)
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample1());
        Thread thread2 = new Thread(new ThreadExample1());
        thread1.start();
        thread2.start();

        ThreadExample2 threadExample1 = new ThreadExample2();
        ThreadExample2 threadExample2 = new ThreadExample2();
        threadExample1.start();
        threadExample2.start();
    }
}
