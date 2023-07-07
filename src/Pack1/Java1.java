package Pack1;
 class Java1  
{
 public int x;
private double y;
char c;
String name;

void display()
{
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("c="+c);
	System.out.println("name="+name);
}
	public static void main(String[] args)
	{
		Java1 ja=new Java1();
		ja.display();
		ja.x=1;
		ja.y=2.0;
		ja.c='a';
	//	j.Surname="narke";
		ja.name="Neha";
		
		
	}
}
