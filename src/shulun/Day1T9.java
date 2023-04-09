package shulun;

public class Day1T9 {
	public static void main(String[] args) {
		int res = lcm(4, 6);
		int k = 1;
		while((res*k)<=2020) {
			k++;
		}
		System.out.println(k);
	}
	private static int lcm(int a, int b) {
		return a*b/gcd(a, b);
	}
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
