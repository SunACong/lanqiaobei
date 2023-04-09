package practice03;

import java.util.Scanner;

public class T103D321 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//在此输入您的代码...
//		String[] strs = scan.next().split("/");
//		for (int i = 0; i < strs.length; i++) {
//			System.out.println(Integer.parseInt(strs[i]));
//			
//		}
		System.out.println(String.format("%.2f", 1.995));
//		System.out.println(String.format("%d-%02d-%02d",Integer.parseInt(strs[0]),Integer.parseInt(strs[1]),Integer.parseInt(strs[2])));
		scan.close();
		System.out.println(Math.round(1.99));
	}
}
