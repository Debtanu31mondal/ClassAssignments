package OOPs.inheritence;
interface Person
{
    void display();
}
interface Bank extends Person
{
    void getInterest();
}
interface Draw extends Person
{
    void drawing();
}
class Students implements Person,Bank,Draw
{
    int id=101;String name="Debtanu Mondal";
    public void getInterest(){
        System.out.println("10% interest rate");
    }
    public void display(){
        System.out.println("Id: "+this.id+" Name: "+this.name);
    }
    public void drawing(){
        System.out.println("Drawing image");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
      Students std=new Students();
      std.display();
      std.getInterest();
      std.drawing();
    }
}
