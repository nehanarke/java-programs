package ObjectOrientedConcepts;

public class MrethodOverloading {
	
	// u cannot create method inside a method
	//same method name with same arguments not allowed.
	
	//Method OverLoading-when same method name with different parameters in same class.
	public void sum() //0 parameters
	{
		System.out.println("sum");
	}
public void sum(int i) //1 input 
{
	System.out.println("Sum");
}
public void sum(int j,int k) //2 input parameters
{
	System.out.println(j+k);
}
	public static void main(String[] args) 
	{
		MrethodOverloading obj=new MrethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20,30);
	}
}
