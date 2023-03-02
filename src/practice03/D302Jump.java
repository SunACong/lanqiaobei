package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class D302Jump {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] dp = new int[n][m];
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
				if(i==0 && j==0) {
					dp[0][0] = arr[0][0];
				}else {
					dp[i][j] = Integer.MIN_VALUE;
					for (int k = 0; k < 4 && (i-k) >= 0; k++) {
						for (int h = 0; h < (4-k) && (j-h) >= 0; h++) {
							if(k==0 && h==0) continue;
							if(k+h > 3) continue;
							dp[i][j] = Math.max(dp[i][j], dp[i-k][j-h]+arr[i][j]);
						}
					}
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
		scan.close();
	}
}
