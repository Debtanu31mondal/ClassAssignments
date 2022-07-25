package thread;
class ProductTable{
    public synchronized void printProductOfNum(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }catch (InterruptedException e){
                System.out.println(e);
            }// end of catch
        } // end of for
    } // end of synchronized method
}
// 1st thread
/*class Thread1 extends Thread{
    ProductTable pt;
    public Thread1(ProductTable pt){
        this.pt=pt;
    }
    public void run()
    {
        pt.printProductOfNum(5);
    }
}
class Thread2 extends Thread {
    ProductTable pt;
    public Thread2(ProductTable pt)
    {
        this.pt=pt;
    }
    public void run()
    {
        pt.printProductOfNum(100);
    }*/
public class SynchronizationDemo {
    public static void main(String[] args) {
        ProductTable pt = new ProductTable();
        Thread t1 = new Thread()
        {
            public void run(){
            pt.printProductOfNum(5);
        }
    };
        Thread t2=new Thread(){
            public void run(){
                pt.printProductOfNum(100);
            }
        };
        t1.start();
        t2.start();
    }
}
