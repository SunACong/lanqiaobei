package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class D330T2155 {
	static long[] p = new long[20];
	static int[] c = new int[40];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(primeNum(n));
		scan.close();
	}
	
	public static int primeNum(long x) {
		int res = 0;
		for (long i = 2; i <= Math.sqrt(x); i++) {
			if (x%i == 0) {
				res+=1;
				p[res] = i;
				c[res] = 0;
				while (x%i == 0){
					x/=i;
					c[res]++;
				}
			}
		}
		if (x>1) {
			res+=1;
			p[res] = x;
			c[res] = 1;
		}
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(c));
		return res;
	}
}
