package OOPs.polymorphism;
class Bank{ // parent class
    public void getLoaninterest()
    {
        System.out.println("8% loan interest");
    }
}
class SBI extends Bank {
    public void getLoaninterest()
    {
        System.out.println("6.75% loan interest");
    }
}
class HDFC extends Bank {
    public void getLoaninterest()
    {
        System.out.println("12% loan interest");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Bank bank;
        bank=new SBI();
        bank.getLoaninterest();


        bank= new HDFC();
        bank.getLoaninterest();

    }
}
