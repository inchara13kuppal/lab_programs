package issuebook;
import requestbook.requestBook;
import student.Student;

public class IssueBook{
	private requestBook rb;
	public IssueBook(requestBook rb2) { this.rb=rb2; }
	public void issueBook()
	{
		System.out.println("\n\nISSUING THE BOOK:-");
		System.out.println("with request id - ("+this.rb.getrequestID()+") is being issued to "+this.rb.getStudent().getName());
		System.out.println("Book is to be delivered to: "+this.rb.getStudent().getregisterNo());
		
	}
}