class TaskThread extends Thread {
    public void run() {

        System.out.println("Task 1: Printing numbers");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("Task 2: Printing characters");
        for(char c='A'; c<='E'; c++){
            System.out.println(c);
        }
    }
}

public class a4_4 {
    public static void main(String[] args) {

        TaskThread t = new TaskThread();
        t.start();
    }
}