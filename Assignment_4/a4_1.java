class NewThread extends Thread {
    public void run() {
        System.out.println("New Thread is running");
    }
}

public class a4_1 {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
    }
}