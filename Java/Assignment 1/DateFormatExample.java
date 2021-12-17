import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample
{
	public static void main(String args[])
	{
		//This is how to get today's date in java
		Date today = new Date();	//new object of date class
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
		String date = DATE_FORMAT.format(today);	//formating date into text 
		System.out.println("\nCurrent Date is: "+date);

		//Another example of formatting Date in java using SimpleDateFormat
		DATE_FORMAT = new SimpleDateFormat("MM-dd-yyyy");
		date = DATE_FORMAT.format(today);	//formating 
		System.out.println("\nCurrent Date is: "+date);	//print date in MM-dd-yyyy format

		//Formatting date with time information
		DATE_FORMAT = new SimpleDateFormat("EEEE d MM yyyy");
		date = DATE_FORMAT.format(today);
		System.out.println("\nCurrent Date is: "+date);
		
		//if you print date you will get unformatted output
		System.out.println("\nCurrent Date and Time is: "+today);
		
		//formatting Date with time information
		DATE_FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm:ssaaaZ");
		date = DATE_FORMAT.format(today);
		System.out.println("\nCurrent Date and Time is: "+date);

		//SimpleDateFormat example - Date with Time zones information
		DATE_FORMAT = new SimpleDateFormat("HH:mm:SS");
		date = DATE_FORMAT.format(today);
		System.out.println("\nCurrent Time is : "+date);
		
		//Display Current week of Year
		DATE_FORMAT = new SimpleDateFormat("w");
		date  = DATE_FORMAT.format(today);
		System.out.println("\nCurrent week of Year is : "+date);
		
		//Display Current week of Month
		DATE_FORMAT = new SimpleDateFormat("W");
		date  = DATE_FORMAT.format(today);
		System.out.println("\nCurrent week of Month is : "+date);

		//Display Current Day of Year
		DATE_FORMAT = new SimpleDateFormat("D");
		date  = DATE_FORMAT.format(today);
		System.out.println("\nCurrent Day of Year is : "+date);
		
		//Display Current Day of Month
		DATE_FORMAT = new SimpleDateFormat("d");
		date  = DATE_FORMAT.format(today);
		System.out.println("\nCurrent Day of Month is : "+date);

	}
}


