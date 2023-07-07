package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//Array concept to store similar datatypes values
		int x[]=new int[4];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		
		System.out.println(x[2]);
		
		System.out.println(x[4]); //ArrayIndexOutOfBound Exception bcz 4th location does not exist.
	
		System.out.println(x.length);//size of Array/length of Array,
		
		System.out.println("Print all values of array :use for Loop");
		for(int j=0;j<x.length;j++)
		{
			System.out.println(x[j]);
		}
	}
}