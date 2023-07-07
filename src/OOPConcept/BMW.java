package OOPConcept;

public class BMW 
{
	int i;
	int j;
	
BMW()
{
	i=10;
	j=20;
	System.out.println("Default Constructor");
}
BMW(int x,int y)
{
	System.out.println("Parameterized constructor");
	i=x;
	j=y;
}
	public void display()
	{
		System.out.println("Value="+i);
		System.out.println("Value="+j);
	}
	
	public static void main(String[] args) 
	{
	BMW b=new BMW();
	BMW b1=new BMW(30,40);
	b.display();
	b1.display();
	}
}
