package shulun;

import java.util.Arrays;

public class Day1T15 {
	static int[] f = new int[20210606];
	public static void main(String[] args) {
		ass();
		int res = 0;
		for (int i = 2; i <= 20210605; i++) {
			if (f[i]==0) {
				String s = String.valueOf(i);
				if (!s.contains("1") && !s.contains("0") && !s.contains("4")
						&& !s.contains("6") && !s.contains("8") && !s.contains("9")) {
					res++;
				}
			}
		}
		System.out.println(res);
	}
	private static boolean isprime(int x) {
		if (x<=3) {
			return x>1;
		}
		if (x%6!=5 && x%6!=1) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(x); i+=6) {
			if (x%(i+2)==0 || x%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private static void ass() {
		f[0] = f[1] = 1;
		for (int i = 2; i < f.length; i++) {
			if (f[i]==0) {
				for (int j = i*2; j < f.length; j+=i) {
					f[j] = 1;
				}
			}
		}
	}
}
