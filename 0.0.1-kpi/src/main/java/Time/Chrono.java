package Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Chrono {
	public static void checkingChronoEnum()
	{
		LocalDate date = LocalDate.now();
		System.out.println("Current date is:"+date);
		
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month"+dayOfNextMonth);
		
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday from now is"+nextSaturday);
		
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of current month"+firstDay);
		
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of Month:"+lastDay);
		
		LocalDate year = date.plus(2,ChronoUnit.YEARS);
		System.out.println("Next to next year is"+year);
		
		LocalDate nextMonth = date.plus(1,ChronoUnit.MONTHS);
		System.out.println("The next month is:"+nextMonth);
		
		LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week is"+nextWeek);
		
		LocalDate Decade = date.plus(2, ChronoUnit.DECADES);
		System.out.println("Next decade is"+Decade);
	}
	public static void main(String[] args)
	{
		checkingChronoEnum();
	}
}
