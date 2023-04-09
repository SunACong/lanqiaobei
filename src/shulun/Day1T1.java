package shulun;

import java.util.*;

public class Day1T1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long p = 2;
		while (N > 1) {
			if (N%p == 0) {
				N = N/p;
			}else {
				p++;
			}
		}
		System.out.println(p);
	}
}
