package shulun;

import java.util.Arrays;

public class Day1T10 {
	static int[] arr = new int[101];
	public static void main(String[] args) {
		long sum = 1;
		getPrime();
		for (int i = 2; i <= 100; i++) {
			if (arr[i] != 0) {
				sum*=(arr[i]+1);
			}
		}
		System.out.println(sum);
	}
	
	private static void getPrime() {
		for (int j = 2; j <= 100; j++) {
			int n = j;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				while(n%i==0) {
					n/=i;
					arr[i]++;
				}
			}
			if (n>1) {
				arr[n]++;
			}
		}
	}
}
