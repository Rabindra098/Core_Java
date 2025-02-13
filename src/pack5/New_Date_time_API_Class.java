package pack5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class New_Date_time_API_Class 
{
	void meth1()
	{
		System.out.println("\nImplementing New date time API");
		for (String s : ZoneId.getAvailableZoneIds()) 
		{
			System.out.println(s);
		}
		System.out.println("\nTotal zoneIds --> "+ZoneId.getAvailableZoneIds().size());
	}
	public static void main(String[] args) 
	{
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalTime.now(ZoneId.of("Asia/Calcutta")));
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
		String ampm=LocalTime.now().format(dtf);
		System.out.println(ampm);
//		new New_Date_time_API_Class().meth1();
	}
	
}
