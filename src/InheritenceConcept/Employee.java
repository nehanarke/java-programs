package InheritenceConcept;
class Office
{
	int id=1;
	void first()
	{
		System.out.println("Id= "+id);
	}
}
class Lab extends Office
{
	String s="Read";
	void books()
	{
		
		System.out.println(s);
	}
}

class Student extends Lab
{
	void Learn()
	{
		int a=10;
		
		System.out.println(a);
		
	}
}

class Child extends Office{
	
	int id=1;
	void Study()
	{
	 System.out.println(id);	
	}
}
public class Employee {
	public static void main(String[] args) 
	{
		Office o=new Office();
		o.first();
		
		Lab l=new Lab();
		l.first();
		l.books();
		
		Student s=new Student();
		s.first();
		s.books();
		s.Learn();
		
		Child c=new Child();
		c.Study();
		c.first();
	} 
}
