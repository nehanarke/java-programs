package ObjectOrientedConcepts;

public class StaticNonStatic {

	String name ="tom";// non static global var
	static int   age =25; //static global var
	
	public static void main(String[] args) 
	{
	//how to call static methods and vars
		//1. direct calling:
		sum();
		StaticNonStatic.sum(); //calling by class name
		System.out.println(age);
		System.out.println(StaticNonStatic.age);
		
		
	}
public void sendMail()
{
	System.out.println("send mail");
}
public static void sum()
{
	System.out.println("Send mail");
}
}
