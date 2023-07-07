package ObjectOrientedConcepts;

public class Car
{
//global var
	
	int mod;
	int wheel;
	//String modelName;
	
	public static void main(String[] args)
	{
		// new keyword is used to create the object
	Car c=new Car(); // new car is object for Car class
	Car c1=new Car();// c1 is object reference var
	Car c2=new Car(); //c2 is object ref 
	
	c.mod=2015;
	c.wheel=4;
	
	c1.mod=2018;
	c1.wheel=2;
	
	c2.mod=2017;
	c2.wheel=4;
	
	//c2.modelName = "hyunday";
	
	/*
	 * System.out.println("Before shifting reference="); System.out.println(c.mod);
	 * System.out.println(c.wheel);
	 * 
	 * System.out.println(c1.mod); System.out.println(c1.wheel);
	 * 
	 * System.out.println(c2.mod); System.out.println(c2.wheel);
	 */

	}
}
