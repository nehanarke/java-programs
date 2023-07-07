package InheritenceConcept;
class Animal
{
	void Breath()
	{
	System.out.println("Breath");
}
}
class Tiger extends Animal
{
void Run()
{
	System.out.println("Run");
}
}
class Mamal extends Animal
{
void walk()
{
	System.out.println("Walk");
}
}
 class reptile extends Mamal
 {
	 void crawl()
	 {
		 System.out.println("Crawl");
	 }
 }
public class HybridInherit {

	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.Breath();
		
		Tiger t=new Tiger();
		t.Run();
		t.Breath();
		
		Mamal m=new Mamal();
		m.Breath();
		m.walk();
		
		reptile r=new reptile();
		r.crawl();
		r.walk();
		
	}

}
