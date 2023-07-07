
class OperatorOverLoad 
{
	void Add(int a)
	{
		System.out.println(a);
	}

	void Add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println(z);
		
	}
	void Add(String s,char c,float f)
	{
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(f);
	}
	void Add(String n)
	{
		System.out.println(n);
	}
	
	public static void main(String[] args) 
	{
		OperatorOverLoad o=new OperatorOverLoad();
		o.Add(10,10);
		o.Add("Neha");
		o.Add("Ani",'n',10);

	}

}
