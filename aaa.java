package week3;

class Student {
    String StudName, dept;
    int Rollno;
    static String clg = "GPT";
    int percentage;
    
    public Student(String Name, int rollno, String cdept, int per) {
        StudName = Name;
        Rollno = rollno;
        dept = cdept;
        percentage = per;
    }
    
    void getStudent() {
        System.out.println(StudName + "\t" + Rollno + "\t" + clg + "\t" + dept + "\t\t" + percentage);
    }
}

class Stud {
    public static void main(String args[]) {
        System.out.println("Name\tRollno\tCollege\tDepartment\tPercentage");
        Student Stud1 = new Student("Inchara", 155, "CS", 88);
        Student Stud2 = new Student("Manasa", 100, "EC", 90);

        
        Stud1.getStudent();
        Stud2.getStudent();
    }
}