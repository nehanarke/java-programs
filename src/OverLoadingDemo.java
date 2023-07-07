
public class OverLoadingDemo
{
int a;
int b;

void Add()
{
	a=50;
	b=60;
	 
	int c=a+b;
	System.out.println(c);
}

void Add(int x,int y,int z)
{
	
	int c=x+y;
	System.out.println(c);
	
}

void Add(String s,int x,int y)
{
	System.out.println(s);
	System.out.println(x);
	System.out.println(y);
}
	public static void main(String[] args) 
	{
		OverLoadingDemo o=new OverLoadingDemo();
		o.Add();
		o.Add("neha",1,2);
	}
}
