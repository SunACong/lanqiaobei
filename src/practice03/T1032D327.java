package practice03;

import java.util.Scanner;

public class T1032D327 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int R = scan.nextInt();
		double d = scan.nextDouble();
		double w = scan.nextDouble();
		double[] wL = new double[L+1];
		double[] wR = new double[R+1];
		for (int i = 1; i <= L; i++) {
			wL[i] = scan.nextDouble();
		}
		for (int i = 1; i <= R; i++) {
			wR[i] = scan.nextDouble();
		}
		double[][][] dp = new double[L+1][R+1][2];
		for (int i = 0; i <= L; i++) {
			for (int j = 0; j <= R; j++) {
				dp[i][j][0] = Integer.MAX_VALUE;
				dp[i][j][1] = Integer.MAX_VALUE;
			}
		}
		dp[1][0][0] = Math.sqrt(w*w/4+wL[1]*wL[1]);
		dp[0][1][1] = Math.sqrt(w*w/4+wR[1]*wR[1]);
		for (int i = 2; i <= L; i++) {
			dp[i][0][0] = dp[i-1][0][0]+wL[i]-wL[i-1];
		}
		for (int i = 2; i <= R; i++) {
			dp[0][R][1] = dp[0][i-1][1]+wR[i]-wR[i-1];
		}
		for (int i = 1; i <= L; i++) {
			for (int j = 1; j <= R; j++) {
				dp[i][j][0] = Math.min(dp[i-1][j][0]+wL[i]-wL[i-1], dp[i-1][j][1]+Math.sqrt(w*w+(wL[i]-wR[j])*(wL[i]-wR[j])));
				dp[i][j][1] = Math.min(dp[i][j-1][1]+wR[j]-wR[j-1], dp[i][j-1][0]+Math.sqrt(w*w+(wR[j]-wL[i])*(wR[j]-wL[i])));
			}
		}
		System.out.printf("%.2f",Math.min(dp[L][R][0] + Math.sqrt(w * w / 4 + (d - wL[L]) * (d - wL[L])),
                dp[L][R][1] + Math.sqrt(w * w / 4 + (d - wR[R]) * (d - wR[R]))));
		scan.close();
	}
}
