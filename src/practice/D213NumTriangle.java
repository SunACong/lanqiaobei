package practice;

import java.util.Scanner;

public class D213NumTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] num = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				num[i][j] = scan.nextInt();
				if(i >= 1) {
					if(j == 0) {
						num[i][j] = num[i][j] + num[i-1][j];
					}else {
						num[i][j] += num[i-1][j-1] >= num[i-1][j]? num[i-1][j-1] : num[i-1][j];
					}
				}
			}
		}
		if (n%2 == 0) {
			System.out.println(num[n-1][n/2] > num[n-1][n/2-1]? num[n-1][n/2] : num[n-1][n/2-1]);
		}else {
			System.out.println(num[n-1][n/2]);
		}
	
        scan.close();
		
	}
}
