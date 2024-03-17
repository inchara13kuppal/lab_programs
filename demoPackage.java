package week6;

import emp.Employee;
import bonus.issueBonus;
public class demoPackage {
    public static void main(String[] args) {
        System.out.println("This program illustrates the use of packages...");
        Employee[] list = new Employee[3];

        // Initialize array of objects individually
        for (byte i = 0; i < list.length; i++) {
            list[i] = new Employee();
        }

        System.out.println("\nEmployee Details:");
        System.out.println("\n********************************************");
        System.out.println("empId\tempName\texpYears\tsalary");
        
        for (byte i = 0; i < list.length; i++) {
            issueBonus.issueEmployeeBonus(list[i]);
            list[i].getEmployee();
        }
        System.out.println("\n********************************************");
    }
}
