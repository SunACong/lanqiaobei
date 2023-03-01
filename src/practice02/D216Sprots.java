package practice02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class D216Sprots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.toString());
		
		LocalDate startTime = LocalDate.of(2000, 1, 1);
		LocalDate endtTime = LocalDate.of(2020, 10, 1);
		int allKM = 0;
		while(!startTime.isAfter(endtTime)) {
//			System.out.println(startTime.getDayOfWeek().getValue());
//			System.out.println(startTime.getDayOfMonth());
			if(startTime.getDayOfWeek().getValue() == 1 || startTime.getDayOfMonth() == 1) {
				allKM += 2;
			}else {
				allKM += 1;
			}
			startTime = startTime.plusDays(1);
		}
		System.out.println(allKM);
	}

}
