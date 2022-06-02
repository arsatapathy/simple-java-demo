package threaddemo;

public class WaitNotifyDemo {
    public static void main(String... args) {
        Queue queue = new Queue();

        Publisher publisher = new Publisher(queue);
        Subscriber subscriber = new Subscriber(queue);

        publisher.t.start();
        subscriber.t.start();

    }
}

class Queue {
    private int i;

    private boolean lock = false;

    synchronized public void put(int i) {
        while (lock)
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

        this.i = i;
        System.out.println("Put :" + i);

        lock = true;
        notify();
    }

    synchronized public void get() {
        while(!lock)
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

        System.out.println("Get:" + i);

        lock = false;
        notify();
    }
}

class Publisher implements Runnable {
    Thread t;
    private Queue queue;

    public Publisher(Queue queue) {
        this.queue = queue;

        t = new Thread(this);
    }


    public void run() {
       int i = 0;

       while (i <= 10) {
           queue.put(i++);
       }
    }
}

class Subscriber implements Runnable {
    Thread t;
    private Queue queue;

    public Subscriber(Queue queue) {
        this.queue = queue;

        t = new Thread(this);
    }

    public void run() {
        int i = 0;

        while (i <= 10) {
            queue.get();
            i++;
        }
    }
}