class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class a4_3 {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);

        t.start();
    }
}