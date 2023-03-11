package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class D307Where {
	static int sum = 0;
	static int[] dp = new int[2022];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = 0;
		for (int i = 2; i < dp.length; i++) {
			for(int j=1; j<=21 && (i-j)>=0; j++) {
				dp[i] = Math.min(dp[i], dp[i-j]+le(i, i-j));
				
			}
		}
		System.out.println(dp[2021]);
		scan.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	public static int le(int a, int b) {
		return a*b/gcd(a, b);
	}

}
