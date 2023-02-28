package practice;

import java.util.Scanner;

public class D225NumCombine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[][] dp =new int[n+1][k+1];
		dp[1][1] = 1;
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=Math.min(i, k); j++) {
				dp[i][j]=dp[i-1][j-1]+dp[i-j][j];
			}
		}
		System.out.println(dp[n][k]);
	}
}