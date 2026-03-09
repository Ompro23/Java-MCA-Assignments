class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class a4_2 {
    public static void main(String[] args) {

        System.out.println("Active threads before: " + Thread.activeCount());

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        System.out.println("Active threads after: " + Thread.activeCount());
    }
}