package InheritenceConcept;
class Bird
{
	void Fly()
	{
	System.out.println("fly");	
	}
}

class sparrow extends Bird
{
	void chirp()
	{
		System.out.println("chirp");	
	}
}
class hen extends Bird
{
void giveseggs()
{
	System.out.println("giveseggs");		
}
}

class cooko extends Bird
{
void twitt()
{
	System.out.println("twitt");	
}
}

public class Hierarchydemo {

	public static void main(String[] args) 
	{
		Bird b=new Bird();
		b.Fly();
		sparrow s=new sparrow();
		s.Fly();
		s.chirp();
		hen h=new hen();
		h.Fly();
		h.giveseggs();
		cooko c=new cooko();
		c.twitt();
		c.Fly();
		

	}

}
