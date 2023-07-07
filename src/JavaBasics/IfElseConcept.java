package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		if(b>a) 
		{
			System.out.println("b is greater than a");
		}else
		{
			System.out.println("a is greater than b");
		}
		//comparision operators = < > <= >= == !=
		
		int c=40;// = is assignment operatot
		int d=40;
		
		if(c==d) //== is comparision operator 
		{
			System.out.println("c and d are equal");
		}else
			System.out.println("c and d are not equal");
// write a logic to find out highest numb
		
		int p=500;
		int q=350;
		int r=800;
		
		if(p>q & p>r) //false and false=false // false +true=false // true+ true=true
		{
			System.out.println("p is greater");
		}else if (q>r)
		{
			System.out.println("q is greater");
		}else {
			System.out.println("r is greater");
		}
	}

}
