package threaddemo;

public class TestThreadClass {


    public static void main(String... args) {
        Thread thread = new Thread(new MyThread1(), "demo thread");
        thread.start();

        MyThread2 myThread01 = new MyThread2("one");
        MyThread2 myThread02 = new MyThread2("two");
        MyThread2 myThread03 = new MyThread2("three");

        myThread01.thread.start();
        myThread02.thread.start();
        myThread03.thread.start();
    }

    static class MyThread1 implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " running..");
        }
    }

    static class MyThread2 implements Runnable {
        private final Thread thread;

        MyThread2(String name) {
            thread = new Thread(this, name);
        }

        public void run() {
            String name = Thread.currentThread().getName();
            for (int i = 5; i > 0; i--) {
                System.out.println(name + i + " running..");
            }
        }
    }




}
