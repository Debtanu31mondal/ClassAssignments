package thread;
public class GarbageCollectionDemo{
    public void finalize(){
        System.out.println("object is garbage collected ");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo demo=new GarbageCollectionDemo();
        demo=null;
        System.gc();
    }
}
