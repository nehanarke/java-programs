package InheritenceConcept;

class Employe
{
	int sal=1000;
}
class Programmer extends Employe
{
	int bonus=5000;
}
public class InheritanceDemo {

	public static void main(String[] args) 
	{
		Programmer p=new Programmer();
		System.out.println(p.bonus);
	}

}
