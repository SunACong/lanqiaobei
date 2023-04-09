package practice03;

import java.util.Scanner;

public class T1217D329 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%.3f",get3Res(nums[i]));
			System.out.println();
		}
		scan.close();
	}
	public static double get3Res(int x) {
		double pow = Math.pow(x, 1.0/3.0);
		return pow;
	}
}
