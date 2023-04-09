package practice03;

import java.util.*;

public class D331T535 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
		Arrays.sort(nums);
		int i = 0;
		int j = 1;
		while (j<nums.length) {
			if (nums[i] != nums[j]) {
				System.out.println(nums[i]+" "+(j-i));
				i = j;
				j++;
			}else {
				j++;
			}
		}
		System.out.println(nums[i]+" "+(j-i));
		scan.close();
	}
}
