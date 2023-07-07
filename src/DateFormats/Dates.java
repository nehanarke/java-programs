package DateFormats;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) 
	{
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/YY");
		String s=sd.format(date);
		System.out.println(s);
		
		SimpleDateFormat sd1=new SimpleDateFormat("dd-MM-YYYY");
		String str2=sd1.format(date);
		System.out.println(str2);
		
		SimpleDateFormat sd2=new SimpleDateFormat("dd-MMMM-yyyy");
		String str3=sd2.format(date);
		System.out.println(str3);
		
		SimpleDateFormat sd3=new SimpleDateFormat("dd | MMMM yy hh:mm");
		String str4=sd3.format(date);
		System.out.println(str4);
		
		SimpleDateFormat sd4=new SimpleDateFormat("dd-MM-yyyy | E | hh:mm" );
		String str1=sd4.format(date);
		System.out.println(str1);	
	}

}
