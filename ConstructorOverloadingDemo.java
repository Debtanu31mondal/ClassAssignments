package OOPs.polymorphism;
class Employee {
    int empId;
    String empName, empAdd, city, country;
    long phno;
    double salary;

    public Employee(int empId, String empName, String empAdd) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
    }

    public Employee(int empId, String empName, String empAdd, long phno, String city) {
        this(empId,empName,empAdd);
        this.phno = phno;
        this.city = city;
    }

    public Employee(int empId, String empName, String empAdd, long phno, String city, String country, double salary) {
        this(empId, empName, empAdd, phno, city);
        this.salary = salary;
        this.country = country;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public long getPhno() {
        return phno;
    }

    public double getSalary() {
        return salary;
    }
}
    public class ConstructorOverloadingDemo {
        public static void main(String[] args) {
            Employee emp1=new Employee(101,"Debtanu","Bally");
            System.out.println(emp1.getEmpId()+" "+emp1.getEmpName()+" "+emp1.getEmpAdd());
            Employee emp2=new Employee(102,"Sanu","Bally",26552958,"Howrah","India",20000);
            System.out.println(emp2.getEmpId()+" "+emp2.getEmpName()+" "+emp2.getEmpAdd()+" "+emp2.getPhno()+" "+emp2.getCity()+" "+emp2.getCountry()+" "+emp2.getSalary());
        }
}
