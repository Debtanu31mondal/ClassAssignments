package thread;
class DivisionTable
{
public synchronized static void printDivisionOfNum(double n){
        for(int i=1;i<=5;i++){
        System.out.println(n/i);
        try {
        Thread.sleep(400);
        }catch (InterruptedException e){
        System.out.println(e);
        }// end of catch
        } // end of for
        } // end of synchronized method
        }
public class SynchronizedStatic {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                DivisionTable.printDivisionOfNum(100);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                DivisionTable.printDivisionOfNum(500);
            }
        };
        t1.start();
        t2.start();
    }
}
