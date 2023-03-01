package practice03;

import java.util.Scanner;

public class D301ResistanceIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int floor = scan.nextInt();
		//	System.out.println(resistanceIndex(3, floor));
		resistanceIndex1(3, floor);
		scan.close();
	}
	
	public static int resistanceIndex(int num, int floor) {
		if(floor == 0) return 0; // 楼层为0的时候就停止不用测试了
		if(num == 1) { // 最后一部手机必须是一层层挨着测试
			return floor;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i != floor+1 ; i++) {
			// max表示最坏的运气
			// min表示最优的策略
			min = Math.min(min, Math.max(resistanceIndex(num-1, i-1), resistanceIndex(num, floor-i)));
		}
		return min+1;
	}
	
	public static void resistanceIndex1(int num, int floor) {
		int dp[][] = new int[floor+1][num+1];
		for (int i = 1; i < dp.length; i++) {
			dp[i][1] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 2; j < dp[0].length; j++) {
				int min = Integer.MAX_VALUE;
				// 对每一个层数都算最优的选择策略
				for (int k = 1; k < i+1; k++) {
					min = Math.min(min, Math.max(dp[k-1][j-1], dp[i-k][j]));
				}
				dp[i][j] = min+1;
				
			}
		}
		System.out.println(dp[floor][num]);
	}
	
}
