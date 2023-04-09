package shulun;

import java.math.BigInteger;
import java.util.*;

public class Day1T13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= N; i++) {
			BigInteger x = BigInteger.valueOf(i);
			result = result.multiply(x).divide(result.gcd(x));
		}
		System.out.println(result);
	}
}
