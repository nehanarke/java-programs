package Constructors;

public class Copyconst 
{
	int rollno;
	String name;
	
	Copyconst(int i,String n)
	{
		rollno =i;
		name=n;
	}
	void display()
	{
	System.out.println(rollno+""+name);
	}
	Copyconst(Copyconst c)
	{
		rollno=c.rollno;
		name=c.name;
	}

	public static void main(String[] args) 
	{
		Copyconst cc=new Copyconst(10,"ani");
		Copyconst c1=new 	Copyconst(cc);
		cc.display();
		c1.display();
		
	}
}
