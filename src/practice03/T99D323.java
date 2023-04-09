package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class T99D323 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//在此输入您的代码...
		int N = scan.nextInt();
		int[][] choc = new int[N][2];
		int K = scan.nextInt();
		for (int i = 0; i < N; i++) {
			choc[i][0] = scan.nextInt();
			choc[i][1] = scan.nextInt();
		}
		int left = 1;
		int right = 100000;
		while (left<right) {
			int mid = left+(right-left)/2;
			if(check(choc, K, mid)) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		if (check(choc, K, left)) {
			System.out.println(left);
		}else {
			System.out.println(left-1);
		}
		scan.close();
	}
	
	public static boolean check(int[][] choc, int K, int target) {
		int sum = 0;
		for (int i = 0; i < choc.length; i++) {
			sum += (choc[i][0]/target)*(choc[i][1]/target);
		}
		return sum>=K? true:false;
	}
}
