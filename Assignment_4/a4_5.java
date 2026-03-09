class PC {
    int value;
    boolean produced = false;

    synchronized void produce(int v) throws InterruptedException {
        while(produced)
            wait();

        value = v;
        System.out.println("Produced: " + value);

        produced = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while(!produced)
            wait();

        System.out.println("Consumed: " + value);

        produced = false;
        notify();
    }
}

class Producer extends Thread {
    PC pc;

    Producer(PC pc){
        this.pc = pc;
    }

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                pc.produce(i);
            }
        }catch(Exception e){}
    }
}

class Consumer extends Thread {
    PC pc;

    Consumer(PC pc){
        this.pc = pc;
    }

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                pc.consume();
            }
        }catch(Exception e){}
    }
}

public class a4_5 {
    public static void main(String[] args) {

        PC pc = new PC();

        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);

        p.start();
        c.start();
    }
}