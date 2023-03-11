package practice03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class D306TimeDisplay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long time = scan.nextLong();
		Date date = new Date();
		date.setTime(time);
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println(dateFormat.format(date));
		scan.close();
	}
}
