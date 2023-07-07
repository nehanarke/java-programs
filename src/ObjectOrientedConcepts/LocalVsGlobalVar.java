package ObjectOrientedConcepts;

public class LocalVsGlobalVar {

	//Global Variable-Class Var which is available throughout prog
	
	String name="tom";
	int age=25;
	
	public static void main(String[] args) 
	{
		int i=10;// Local var for main method
		System.out.println(i);
			LocalVsGlobalVar L=new LocalVsGlobalVar();
			 System.out.println(L.name);
			 System.out.println(L.age);
	
	}
	public void sum()
	{
		int i=10;// local var for sum
		int j=20;
		int age=25;
		
	}

}
