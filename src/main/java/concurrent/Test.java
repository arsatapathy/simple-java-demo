package concurrent;

class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class TestingThread extends Thread {
    TestingThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        TestThread testThread1 = new TestThread();
        TestThread testThread2 = new TestThread();

        TestingThread testingThread1 = new TestingThread("testing-1");
        TestingThread testingThread2 = new TestingThread("testing-2");

        Thread thread1 = new Thread(testThread1, "test-1");
        Thread thread2 = new Thread(testThread2, "test-2");

        thread1.start();
        thread2.start();

        testingThread1.start();
        testingThread2.start();
    }
}
