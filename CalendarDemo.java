package com.cognizant;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemmo {

	public static void main(String[] args) {
	 Date date = new Date();
	 System.out.println(date);
	 Calendar c = Calendar.getInstance();
	 System.out.println("Year:"+c.get(Calendar.YEAR));
     System.out.println("Month:"+c.get(Calendar.MONTH));
     System.out.println("Day:"+c.get(Calendar.DAY_OF_MONTH));
	System.out.println("WeekDay:"+c.get(Calendar.DAY_OF_WEEK));
	System.out.println("Hour:"+c.get(Calendar.HOUR_OF_DAY));
	System.out.println("Minute:"+c.get(Calendar.MINUTE));
	System.out.println("Second:"+c.get(Calendar.SECOND));
	System.out.println("Millis:"+c.get(Calendar.MILLISECOND));
	
	}

}
