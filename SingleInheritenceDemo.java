package OOPs.inheritence;
class User {
    public int id;
    public String name;
    public String address;
    public long phno;

    public void setData(int id, String name, String address, long phno) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phno = phno;
    }
    public void getData() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phno);
    }
}

class Student extends User
{
    void display()
    {
        System.out.println("child class");
    }
}
public class SingleInheritenceDemo {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setData(101,"Debtanu Mondal","Howrah",26552958);
        student1.getData();
        student1.display();
    }
}
