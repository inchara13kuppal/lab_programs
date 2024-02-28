package week2;

class WomenDayBonus {
    static class Employee {
        String name;
        String gender;
        float salary;

        Employee(String name, String gender, float salary) {
            this.name = name;
            this.gender = gender;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Abhi", "Female", 50000),
            new Employee("Bahu", "Male", 60000),
            new Employee("Inchara", "Female", 60000)
        };
        System.out.println("On account of International Women's Day -\n");
 
        for (Employee emp : employees) {
            if (emp.gender.equalsIgnoreCase("Female")) {
                double bonus = emp.salary * 0.1; // Calculate 10% bonus for female employees
                emp.salary += bonus; // Add the bonus to the salary
                System.out.println("Issuing 10% bonus to " + emp.name + " will increment the net salary: Rs " + emp.salary +" + "+ bonus);
                System.out.println("Updated salary for " + emp.name + ": Rs " + emp.salary + "\n");
            }
        }
    }
}
