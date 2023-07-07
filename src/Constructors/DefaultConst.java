package Constructors;

public class DefaultConst 
{
int rollno;
String name;

 void display()
{
	System.out.println(rollno+" "+name);
}
	public static void main(String[] args) 
	{
		DefaultConst d=new DefaultConst();// output is 0 and null as compiler provides default constructor
		d.display();

	}

}
