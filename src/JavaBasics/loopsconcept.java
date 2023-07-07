package JavaBasics;

public class loopsconcept {

	public static void main(String[] args) {
		
		//1.While  Loop- while loop is that it will give infinate loop if u dont give increamental or decreamental condition
		// dis advantage of 
		int i=1;
		
		while(i<=10) //print 1 to 10
		{
			System.out.println(i);
			i=i+1;
		}
		System.out.println("*****************************");
		
		// j++ means  j=j+1
		//For Loop
		for(int j=1;j<=10;j++) // intialize, condition,increamental 
		{
			System.out.println(j);
		}
		System.out.println("*****************************");
		for(int x=10;x>=1;x--)
		{
			System.out.println(x);
		}
			}

}
