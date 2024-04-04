package week9;

import java.util.Scanner;

class students
{
	String name;
	float[] CIE= {0,0,0};
	float avg;
	byte rollno;
	void setstudents (String n,float ia[],byte rno)
	{
		name=n;
		avg=0.0f;
		rollno=rno;
		for(byte i=0;i<3;i++)
		CIE[i]=ia[i];
		this.calculateAverage();
	}
	void calculateAverage()
	{
		float sum=0.0f;
		for(byte i=0;i<3;i++)
		sum=sum+CIE[i];
		avg=sum/3.0f;
	}
	void showstudents()
	{
		System.out.println(rollno+"\t\t"+name+"\t\t"+avg+"\t\t");
	}
}
class Grade extends students
{
	final byte grace=10;
	float attendence;
	Scanner sc=new Scanner(System.in);
	void setstudents(String n,float ia[],byte rno)
	{
		System.out.println("enter the attendance of students..");
		attendence=sc.nextFloat();
		if(attendence>=75.0f)
		{
			ia[2]=grace;
			super.setstudents(n,ia,rno);
		}
		else
			super.setstudents(n,ia,rno);
	}
}
class demoMethodOverriding
{
	public static void main(String args[])
	{
		Grade mi=new Grade();
		float[] CIE= {18.4f,23.7f,0};
		mi.setstudents("inchara",CIE,(byte)15);
		System.out.println("the internal details of student.");
		System.out.println("RollNO\t\tName\t\tAverage");
		mi.showstudents();
	}
}
