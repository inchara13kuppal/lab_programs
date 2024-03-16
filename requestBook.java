package requestbook;

import java.util.Random;

import student.Student;

public class requestBook{
	private Student student;
	private String requestID;
	private String bookName;
	private int duration;
	public Student getStudent() { return student; }
	public void setStudent(Student student)
	{
		this.student=student;
	}
	public String getrequestID() { return requestID; }
	public void setrequestID(String bookName)
	{
		Random random=new Random();
		this.requestID=(bookName+"-"+random.nextInt(500));
	}
	public String getbookName() {return bookName; }
	public void setbookName(String bookName)
	{
		this.bookName=bookName;
		setrequestID(bookName);
	}
	public int getduration() { return duration; }
	public void getduration(int duration)
	{
		this.duration=duration;
	}
	public void SearchBook()
	{
		System.out.println("Searching book for Student- "
	+this.getStudent().getName()
	+" who had requested for - "
	+this.getbookName());
	}
}