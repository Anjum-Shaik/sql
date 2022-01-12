package com.cognizant;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		
          Date date= new Date();
          DateFormat df;
          df=DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
          System.out.println("United Kingdom:" +df.format(date));
          df=DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
          System.out.println("United Kingdom:" +df.format(date));
          df=DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
          System.out.println("United Kingdom:" +df.format(date));
          df=DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
          System.out.println("United States:" +df.format(date));
          df=DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
          System.out.println("United  States:" +df.format(date));
          df=DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
          System.out.println("United  States:" +df.format(date));
          
          
	}

}
