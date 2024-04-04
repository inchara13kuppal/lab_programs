package week9;

public class student 
{
	String name;
	float[] CIE= {0,0,0};
	float avg;
	byte rollNo;
	void setstudent(String n,float ia[],byte rno)
	{
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollNo=rno;
		for(byte i=0;i<3;i++)
		{
			CIE[i]=ia[i];
			sum=sum+CIE[i];
		}
		avg=sum/0.0f;
	}
	void setstudent(String n,float ia1,float ia2,byte no)
	{
		name=n;
		rollNo=no;
		CIE[0]=ia1;
		avg=(CIE[0]+CIE[1]/3.0f);
	}
	void setstudent(String n ,float ia,byte rno)
	{
		name=n;
		rollNo=rno;
		CIE[0]=ia;
		avg=(CIE[0])/3.0f;
	}
	void showstudent()
	{
		System.out.println(rollNo+"\t\t"+name+"\t\t"+avg+"\t\t");
	}
}
class demoMethodoverloading
{
	public static void main(String args[])
	{
		student mi=new student();
		System.out.println("The internal details of a student.");
		System.out.println("RollNo\t\tName\t\tAverage");
		mi.setstudent("manasa",19.4f ,(byte)12);
		mi.showstudent();
		mi.setstudent("inchara", 19.4f, (byte)10);
		mi.showstudent();
		float[]CIE= {17.0f,12.6f,19.2f};
		mi.setstudent("harshi",19.5f,(byte)8);
		mi.showstudent();
	}
}

