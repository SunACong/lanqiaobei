package practice03;

import java.util.Scanner;

public class D306Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] num = new long[n];
		long[] dp = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
			dp[i] = num[i];
			sum += num[i];
		}
		for (int i = 0; i < n; i++) {
			dp[i] = sum - num[i];
			sum = sum - num[i];
		}
		long result = 0;
		for (int i = 0; i < n; i++) {
			result += num[i]*dp[i]; 
		}
		System.out.println(result);
		scan.close();
	}
}
