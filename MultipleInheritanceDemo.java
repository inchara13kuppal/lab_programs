package week8;
interface Allowance
{
    final double dearnessAllow = 0.45;
    final double houseRentAllow = 0.30;
    final double cityAllow = 400.00;

    void calculateGross();
}

class Employee
{
    double basicSalary,grossSalary;
    String empName;
    long empNumber;

    Employee(String name, long no, double sal)
    {
        empName = name;
        empNumber = no;
        basicSalary = sal;
    }

    void displayEmployeeDetails()
    {
        System.out.println("***********************************************");
        System.out.println("Employee name is\t:\t" + empName);
        System.out.println("His Employee Number is\t:\t" + empNumber);
        System.out.println("His basic salary is\t:\t" + basicSalary);
        System.out.println("His Gross Salary is\t:\t" + grossSalary);
        
    }
}

class PayRoll extends Employee implements Allowance
{
    PayRoll(String name, long no, double sal)
    {
        super(name,no,sal);
        calculateGross();
    }

    public void calculateGross()
    {
        grossSalary = basicSalary + (basicSalary * dearnessAllow) + (basicSalary * houseRentAllow) + cityAllow;
    }
}

public class MultipleInheritanceDemo
{
    public static void main(String[] args) 
    {
        PayRoll vayu = new PayRoll("Vayu dev", 127966, 45000.0d);
        vayu.displayEmployeeDetails();
        
        PayRoll rajath = new PayRoll("Rajath Singh", 128066, 25600.0d);
        rajath.displayEmployeeDetails();
    }
}
