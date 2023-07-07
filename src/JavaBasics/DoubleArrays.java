package JavaBasics;

public class DoubleArrays {

	public static void main(String[] args) {
		//One Dimensional Array=
		
		//disadvantages of array=size is fixed  - to overcome we use Collections -- Arraylist,Hashtable 
		//stores only similar datatypes. to overcome this we use object array.
		
		System.out.println("******Double Array******");
		double d[]=new double[5];
		d[0]=12.32;
		d[1]=10.22;
		d[2]=14.14;
		d[3]=17.11;
		d[4]=18.33;
	
		System.out.println(d[2]);
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		//Object Array-(object is class , it is ued to store different data types.)
		Object ob[]=new Object[6];
		ob[0]="tom";
		ob[1]=25;
		ob[2]=12.20;
		ob[3]="1/10/2020";
		ob[4]='F';
		ob[5]="London";
		System.out.println(ob[5]);
		System.out.println(ob.length);
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
	}

}
