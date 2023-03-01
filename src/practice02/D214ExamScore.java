package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class D214ExamScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num1 = num;
        int max = 0;
        int min = 100;
        double avg = 0;
        while(num-- > 0) {
        	int everyNum = scan.nextInt();
        	max = everyNum > max? everyNum:max;
        	min = everyNum < min? everyNum:min;
        	avg += everyNum;
        }
        System.out.println(max);
        System.out.println(min);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(avg/num1));
        System.out.println(String.format("%.2f", avg/num1));
        scan.close();
	}
	

}
