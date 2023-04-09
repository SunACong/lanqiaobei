package practice03;

import java.util.Scanner;

public class T143D323 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//在此输入您的代码...
		int target = scan.nextInt();
		int sy = 0;
		int result = target;
		while ((target+sy)>=3) {
			int cur = sy;
			sy = (target+cur)%3;
			target = (target+cur)/3;
			result += target;
		}
		System.out.println(result);
		scan.close();
	}
}
