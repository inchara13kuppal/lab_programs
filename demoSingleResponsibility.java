package week6;
import java.util.*;
import java.util.Random;

public class demoSingleResponsibility {
	public static void main(String args[])
	{
		Student sony=new Student();
		sony.setName("sony Mathew");
		sony.setregisterNo("119CS20001");
		requestBook rb=new requestBook();
		rb.setbookName("java programming");
		rb.getduration(2);
		rb.setStudent(sony);
		rb.SearchBook();
		IssueBook iborder=new IssueBook(rb);
		iborder.issueBook();
		}
	}
class Student{
	private static String name;
	private String registerno;
	public static Object getName(){ return name; }
	@SuppressWarnings("static-access")
	public void setName(String name) { this.name=name; }
	public String getregisterNo() { return registerno; }
    public void setregisterNo(String rno)
    {
    	this.registerno=rno;
    }
}
class requestBook{
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
		System.out.println("Searching book for Student- "+this.getStudent().getName()+" who has requested "+this.getbookName());
	}
}
class IssueBook{
	private requestBook rb;
	public IssueBook(requestBook rb) { this.rb=rb; }
	public void issueBook()
	{
		System.out.println("isuuing the book");
		System.out.println("with request id - "+this.rb.getrequestID()+" being issued to "+this.rb.getStudent().getName());
		System.out.println("Book is to be delivered to: "+this.rb.getStudent().getregisterNo());
		
	}
}