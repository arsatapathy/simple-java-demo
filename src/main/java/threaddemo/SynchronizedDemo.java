package threaddemo;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Print p = new Print();

        Printer printer1 = new Printer(p, "ashish");
        Printer printer2 = new Printer(p, "ranjan");
        Printer printer3 = new Printer(p, "satapathy");

        printer1.t.start();
        printer2.t.start();
        printer3.t.start();
    }
}

class Print {

    synchronized public void print(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Printer implements Runnable {
    Thread t;
    private Print print;
    private String message;

    public Printer(Print print, String message) {
        this.print = print;
        this.message = message;

        t = new Thread(this);
    }

    public void run() {
        print.print(message);
    }
}
