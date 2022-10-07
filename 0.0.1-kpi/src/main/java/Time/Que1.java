package Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Que1{
	
	public static void checkingChronoEnum()
	{
		LocalDate date = LocalDate.now();
	//	System.out.println("Current date is:"+date);
		
		LocalDate year = date.plus(8,ChronoUnit.YEARS);
		System.out.println("Date on Wednesday of 2030 is :"+year);
		
		LocalDate next = year.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("Day of the Wed:"+next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingChronoEnum();

	}

}
