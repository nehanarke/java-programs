package JavaBasics;

public class StringConcatenation
{
	public static void main(String[] args)
	{
		//+ is a concatenation operator.
		//println=is used to print on console with a new line.
		//print =it is used to print on console.
	
		int a=100;
		int b=200;
		String s="hello";
		String s1="world";
		
		double d=10.33;
		double d1=50.33;
		System.out.println(a+b);
		System.out.println(s+s1);
		System.out.println(a+b+s+s1); 
		System.out.println(s+s1+a+b);//Execution always starts from left to right so it will return hello world100200
		
		System.out.println(s+s1+(a+b));
		System.out.println(a+b+s1+a+b+s);
		
		System.out.println(d+d1+s+s1);
		System.out.println(s+d+s1+d1);
		
		System.out.println("value of a="+a);
		System.out.println("value of a and b="+(a+b));
	
		// TODO Auto-generated method stub

	}

}
