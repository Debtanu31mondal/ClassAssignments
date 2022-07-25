package thread;

public class ProrityThread extends Thread {
    public ProrityThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is running"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ProrityThread t1=new ProrityThread("T1:");
        ProrityThread t2=new ProrityThread("T2:");
        ProrityThread t3=new ProrityThread("T3:");
        ProrityThread t4=new ProrityThread("T4:");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
