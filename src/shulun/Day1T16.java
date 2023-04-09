package shulun;

public class Day1T16 {
	public static void main(String[] args) {
		int[] nums = new int[61];
 		for (int i = 1; i <= 60; i++) {
			int count = 0;
			int k = 1;
			while(count<i) {
				count = 0;
				for (int j = 1; j <= k; j++) {
					if (k%j==0) {
						count++;
					}
				}
				k++;
			}
			nums[i] = k-1;
		}
 		int res = 0;
 		for (int i = 0; i < nums.length; i++) {
			res+=nums[i];
		}
 		System.out.println(res);
	}
}
