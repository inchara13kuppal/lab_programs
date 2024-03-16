package week6;
import student.Student;
import requestbook.*;
import issuebook.IssueBook;

public class demoSRP {
	public static void main(String args[])
	{
		Student inchara=new Student();
		inchara.setName("Inchara K Kuppal");
		inchara.setregisterNo("119CS22021");
		requestBook rb=new requestBook();
		rb.setbookName("java programming");
		rb.getduration(2);
		rb.setStudent(inchara);
		rb.SearchBook();
		IssueBook iborder=new IssueBook(rb);
		iborder.issueBook();
		}
	}


