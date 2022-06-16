package OOPs.inheritence;
class Debtanu {
    public void methodA() {
        System.out.println("This is the method of parent class debtanu");
    }
}
class Kumlo extends Debtanu {
    {
        System.out.println("My name is Dholkumlo");
    }
}
class tuktuki extends Debtanu {
    {
        System.out.println("I am Tuktuki");
    }
}
public class Hirarchical {
    public static void main(String[] args) {
        Kumlo golu=new Kumlo();
        tuktuki dhapdhap=new tuktuki();
        golu.methodA();
        dhapdhap.methodA();
    }
}
