package week6;
import java.util.Scanner;
public class demoSRPCalculator {
	public static void main(String []args) {
		double result=0;
		readInputValues input= new readInputValues();
		switch(input.operation)
		{
		case '+':
			result=Addition.sum(input);break;
		case '-':
			result=Subtraction.difference(input);break;
		case '*':
			result=Multiplication.product(input);break;
		case '/':
			result=Division.quotient(input);break;
		case '%':
			result=Modulus.remainder(input);break;
		default:
			System.out.println("enter valid choice...");break;
		}
		if(result>0)System.out.println("the result is..."+result);
		}
	}
class readInputValues{
	double num1,num2;
	char operation;
	readInputValues(){
		Scanner SC= new Scanner(System.in);
		System.out.println("enter any non zero number...");
		num1=SC.nextDouble();
		System.out.println("enter any non integer number...");
		num2=SC.nextDouble();
		System.out.println("enter your choice...");
		operation=SC.next().charAt(0);
		SC.close();
		}
}
class Addition{
	public static double sum(readInputValues ip) {
		return(ip.num1+ip.num2);
		}
}
class Subtraction{
	public static double difference(readInputValues ip) {
		return(ip.num1-ip.num2);
	}
	
}
class Multiplication{
	public static double product(readInputValues ip) {
		return(ip.num1*ip.num2);
	}
	
}
class Division{
	public static double quotient(readInputValues ip) {
		return(ip.num1/ip.num2);
	}
	
}
class Modulus{
	public static double remainder(readInputValues ip) {
		return(ip.num1%ip.num2);
	}
	
}
