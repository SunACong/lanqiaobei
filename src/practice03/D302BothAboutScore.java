package practice03;

import java.util.Scanner;

public class D302BothAboutScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		for (int i = 1; i <= 2020; i++) {
			for (int j = 1; j <= 2020; j++) {
				if(gcd(i, j) == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		scan.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
