package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class T2107 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] dict = new int[N];
		int[] cur = new int[N];
		Arrays.fill(cur, 1);
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < N-1; i++) {
				for (int j = 0; j < cur.length; j++) {
					if(i == j) cur[j] = 1;
					cur[j]++;
				}
				for (int j = 0; j < dict.length; j++) {
					dict[j] = Math.max(cur[j], dict[j]);
				}
			}
			
			for (int i = N-1; i >= 1; i--) {
				for (int j = 0; j < cur.length; j++) {
					if(i == j) cur[j] = 1;
					cur[j]++;
				}
				for (int j = 0; j < dict.length; j++) {
					dict[j] = Math.max(cur[j], dict[j]);
				}
			}
		}
		for (int i = 0; i < dict.length; i++) {
			System.out.println(dict[i]-1);
		}
		//在此输入您的代码...
		scan.close();
	}
}
