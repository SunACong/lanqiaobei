package shulun;

import java.util.*;

public class Day1T2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int res = 0;
		for (int i = 2; i < m; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				res++;
			}
		}
		System.out.println();
		System.out.println(res);
		scan.close();
	}

	public static boolean isPrime(int x) {
		if (x <= 3) {
			return x > 1;
		}
		if (x % 6 != 5 && x % 6 != 1) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(x); i += 6) {
			if (x % (i + 2) == 0 || x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
