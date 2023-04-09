package practice03;

import java.util.Scanner;

public class D330T1020 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] map = new int[100];
		for (int i = 1; i <= 100; i++) {
			int k = i;
			for (int j = 2; j <= Math.sqrt(k); j++) {
				if (k%j == 0) {
					while (k%j==0) {
						k/=j;
						map[j]++;
					}
				}
			}
			if (k>1) {
				map[k]++;
			}
		}
		long ans = 1;
		for (int i = 1; i < 100; i++) {
			if (map[i] != 0) {
				ans *= (map[i]+1);
			}
		}
		System.out.println(ans);
		scan.close();
	}
}
