package thread;

public class DeadlockCondition {
    public static void main(String[] args) {
        final String resource1="Pen";
        final String resource2="paper";
        Thread Debtanu=new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Debtanu locked resource1: pen");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                    }
                    synchronized (resource2){
                        System.out.println("Debtanu tries to lock resource2: paper");
                    }
                }
            }
        };
        Thread Suchandra=new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Suchandra locked resource1: paper");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                    }
                    synchronized (resource2){
                        System.out.println("Suchandra tries to lock resource2: pen");
                    }
                }
            }
        };
        Debtanu.start();
        Suchandra.start();
    }
}
