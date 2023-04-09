package shulun;

import java.util.Arrays;

public class Day1T8 {
	static int[] prime = new int[2020];
	static int k = 0;
	static int[][] f = new int[2020][2020];

	public static void main(String[] args) {
		int res = 0;
		k = ass(2019);
		f[0][0] = 1;
		System.out.println(Arrays.toString(prime));
		for (int i = 1; i < k; i++) {
			System.out.println(prime[i]);
			for (int j = 0; j <= 2019; j++) {
				f[i][j] = f[i - 1][j];
				if (j >= prime[i])
					f[i][j] += f[i - 1][j - prime[i]];
			}
		}
		System.out.println(f[k - 1][2019]);
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

	public static int ass(int x) {
		int[] isPrime = new int[x + 1];
		Arrays.fill(isPrime, 1);
		int res = 0;
		isPrime[0] = isPrime[1] = 0;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i] == 1) {
				res++;
				prime[k++] = i;
				for (int j = i * 2; j < isPrime.length; j += i) {
					isPrime[j] = 0;
				}
			}
		}
		return res;
	}
}
