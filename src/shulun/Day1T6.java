package shulun;

import java.util.*;

public class Day1T6 {
	public static void main(String[] args) {
		int res = 0;
//		for (int i = 2333333; i <= 23333333; i++) {
////			System.out.println(i);
//			if (isPrime(i) == 12) {
//				res++;
//			}
//		}
//		System.out.println(res);
		getPrime(17);
	}

	public static int primeDivide(int x) {
		int p = 2;
		int res = 0;
		while (x > 1) {
			if (x % p == 0) {
				x /= p;
				res++;
			} else {
				p++;
			}
		}
		return res;
	}

//	public static int isPrime(int n) {
//		int res = 0;
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			int count = 0;
//			while (n % i == 0) {
//				n /= i;
////				System.out.print(i + " ");
//				count++;
//			}
//			if (count != 0) {
//				res += count;
//			}
//		}
//		if (n > 1) {
////			System.out.print(n);
//			res++;
//		}
//		return res;
//	}
	
	public static void getPrime(int x) {
		for (int i = 2; i <= Math.sqrt(x); i++) {
			int count = 0;
			while(x%i==0) {
				x/=i;
				System.out.print(i+" ");
				count++;
			}
//			if (count!=0) {
//				
//			}
		}
		if (x > 1) {
			System.out.println(x);
		}
	}

}
