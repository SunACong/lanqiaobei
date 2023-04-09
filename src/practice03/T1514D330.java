package practice03;

import java.math.BigInteger;
import java.util.Scanner;

public class T1514D330 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long b = scan.nextLong();
		long p = scan.nextLong();
		long k = scan.nextLong();
		System.out.println(fastPow(b, p, k));
		scan.close();
	}
	
	public static long fastPow(long a, long n, long mod) {
		long ans = 1;
		a%=mod;
		while(n != 0) {
			if((n&1) == 1) ans = (ans*a)%mod;
			a = a*a % mod;
			n>>=1;
		}
		return ans;
	}
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
