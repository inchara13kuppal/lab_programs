package week3;

class Employees {
    String empName;
    int empNo;
    String empDesig;
    byte expYrs;
    double basicSalary;
    double netSalary;
    double grossSalary;
    double dearnessAllowance;
    double HRA;
    double PA;
    double IT;

    Employees() {
        empName = null;
        empNo = 0;
        empDesig = null;
        expYrs = 0;
        basicSalary = 0.0d;
    }

    Employees(String name, int no, String des, byte ex, double basicsalary) {
        empName = name;
        empNo = no;
        empDesig = des;
        expYrs = ex;
        basicSalary = basicsalary;
    }

    Employees(Employees obj1, Employees obj2) {
        empName = obj1.empName;
        empNo = obj2.empNo;
        empDesig = obj1.empDesig;
        expYrs = obj2.expYrs;
        basicSalary = obj2.basicSalary;
    }

    void getEmployee() {
        dearnessAllowance = basicSalary * 0.40;
        HRA = basicSalary * 0.25;
        PA = basicSalary * 10;
        grossSalary = basicSalary + dearnessAllowance + HRA + PA;

        IT = basicSalary * 10;
        netSalary = grossSalary - IT;

        System.out.println(empName + "\t" + empNo + "\t" + empDesig + "\t\t" + expYrs + "\t\t" + basicSalary + "\t\t" + grossSalary + "\t\t  " + netSalary);
    }

    public static void main(String[] args) {
        System.out.println("empName\t empNo\t empDesig\t expYrs\t   basicSalary\t\t grossSalary\t   netSalary");
        Employees inchara = new Employees();
        inchara.getEmployee();
        
        Employees roopa = new Employees("roopa", 100, "Manager", (byte) 10, 10000.0d);
        roopa.getEmployee();
        
        Employees ramya = new Employees(inchara, roopa);
        ramya.getEmployee();
    }
}
