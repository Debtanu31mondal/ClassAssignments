package OOPs;
//java bean
class Employee{
    // archived encapsulation
    private int empId; // instance variable
    private String empName; // instance variable
    private String designation; // instance variable
    // initializing data members
    public Employee(int empId,String empName,String designation) //(parameters)
    {
        this.designation=designation;
        this.empId=empId;
        this.empName=empName;
    }
// Setter and Getter method
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
public class ThisAndStaticDemo {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"Sanu","developer");
        Employee emp2= new Employee(102,"Debtanu","Developer");
        System.out.println("Employee Id: "+emp1.getEmpId());
        System.out.println("Employee name: "+emp1.getEmpName());
        System.out.println("Employee designation: "+emp1.getDesignation());
        System.out.println("Employee Id: "+emp2.getEmpId());
        System.out.println("Employee Id: "+emp2.getEmpName());
        System.out.println("Employee Id: "+emp2.getDesignation());

    }
}
