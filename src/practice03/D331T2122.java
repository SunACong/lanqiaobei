package practice03;

import java.util.*;

public class D331T2122 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Integer[] nums = new Integer[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (nsum(o1) != nsum(o2)) {
					return nsum(o1) - nsum(o2);
				}
				return o1-o2;
			}
		});
		System.out.println(nums[m-1]);
		scan.close();
	}
	
	
	public static int nsum(int x) {
		int sum = 0;
		while (x>0) {
			sum+=x%10;
			x/=10;
		}
		return sum;
	}
}
