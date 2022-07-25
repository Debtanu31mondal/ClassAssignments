package thread;

public class ThreadDemo2 implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadDemo2()); // new state
        t1.start(); // runnable state

    }
}
