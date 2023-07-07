package Constructors;

public class ParameterizedConst 
{
	int rollno;
	String name;
	
	ParameterizedConst(int x,String n)
	{
		rollno=x;
		name=n;
	}
	void display()
	{
		System.out.println("Rollno"+rollno);
		System.out.println("name="+name);
	}
	public static void main(String[] args) 
	{
		ParameterizedConst p=new ParameterizedConst(10,"neha");
		p.display();
			
	}

}
