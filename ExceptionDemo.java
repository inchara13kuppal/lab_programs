package week11;

class NumberRangeException extends Exception
{
	String message;
	NumberRangeException(String msg)
	{
		this.message=msg;
	}
	public String getmessage()
	{
		return message;
	}
}

public class ExceptionDemo
{
	public static void main(String args[])
	{
		int number=14;
		try
		{
			if(number<10||number>20)
			{
				throw new NumberRangeException("number not within specified range");
			}
			System.out.println("The number in range is:"+number);
		}
		catch(NumberRangeException nre)
		{
			System.out.println(nre.getmessage());
		}
	}
}