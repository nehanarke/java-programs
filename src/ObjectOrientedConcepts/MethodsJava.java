package ObjectOrientedConcepts;

public class MethodsJava {
	
	// void does not return value
	// Non static method
	
	public void test() // no input no output
	{
		System.out.println("Test Method");
	}
	public int pqr() //no input but some output
	{
	System.out.println("method=");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public String qa() //no input but some output
	{
		System.out.println("Qa method=");
		String s ="Selenium";
		return s;
		
	}
	
	public int division(int x,int y) // x and y input parameters
	{
		System.out.println("div method=");
	int d=x/y;
	return d;
	}
	public static void main(String[] args) 
	{
		MethodsJava m =new MethodsJava(); 
		// m is object reference variable .
		// After creating object ,the copy of all non static methods  will be given to this object 
		m.test();
		m.division(10,20);
		m.division(30,40);
		m.pqr();		
	}
}
