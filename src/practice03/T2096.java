package practice03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class T2096 {
	public static void main(String[] args) {
		String dt = "20220101";
		int cnt = 0;
		while(!"20221231".equals(dt)) {
			char[] arr = dt.toCharArray();
			for (int i = 0; i < arr.length-2; i++) {
				if(arr[i]==arr[i+1]-1 && arr[i]==arr[i+2]-2) {
					cnt++;
				}
			}
			dt = addOneDay(dt);
		}
		System.out.println(cnt++);
	}
	
	static public String addOneDay(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate days = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd")).plusDays(1);
		return days.format(dtf);
	}
}
