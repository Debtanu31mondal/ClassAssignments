package OOPs.inheritence;
interface Demo
{
    int x=10;
    void fun();
    void rain();
}
class Child implements Demo
{
    public void fun()
    {
        System.out.println("enjoying");
    }
    public void rain(){
        System.out.println("it's raining");
    }
}
class sub implements Demo{
    public void fun(){
        System.out.println("enjoying sub");
    }
    public void rain(){
        System.out.println("it's raining sub");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.fun();
        c1.rain();
        Demo demo=new sub(); // upcasting
        demo.fun();
        demo.rain();
    }
}
