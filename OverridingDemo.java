package OOPs.polymorphism;
class Banking { // parent class
    public void getLoanInterest()
    {
        System.out.println("8% loan interest");
    }
}
class SBIBank extends Banking {
    public void getLoanInterest()
    {
        System.out.println("7.75% loan interest");
    }
}
class HDFCBank extends Banking {
    public void getLoanInterest()
    {
        System.out.println("12% loan interest");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        SBIBank sbi=new SBIBank();
        HDFCBank hdfc=new HDFCBank();
        sbi.getLoanInterest();
        hdfc.getLoanInterest();
    }
}
