package shulun;

import java.util.*;

public class Day1T17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		for (int i = 1; ; i++) {
			if (i%a==0 && i%b==0 && i%c==0) {
				System.out.println(i);
				return;
			}
		}
	}
	public static int  lcm(int a, int b) {
		return a*b/gcd(b, a%b);
	}
	public static int  gcd(int a, int b) {
		if (b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
