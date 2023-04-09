package shulun;

import java.util.*;

public class Day1T5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] nums = new long[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		long a = nums[1]-nums[0];
		for (int i = 2; i < nums.length; i++) {
			a = gcd(a, Math.abs(nums[i]-nums[i-1]));
		}
		Arrays.sort(nums);
		if (nums[nums.length-1]-nums[0] == 0) {
			System.out.println(n);
		}else {
			System.out.println((nums[nums.length-1]-nums[0])/a+1);
		}
		
	}
	
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
