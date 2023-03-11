package practice03;

import java.util.Scanner;

public class D309YHTangle {
	static long[][] dp = new long[10000][10000];
// 	复杂度太高，只能拿到20%的分数
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		//在此输入您的代码...
//		long target = scan.nextLong();
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.println((1+i)*i/2+j+1);
//				if(j == 0 || j == i) {
//					dp[i][j] = 1;
//					if(j==1) break;
//				}else {
//					dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
//				}
//				if(dp[i][j] == target) {
//					System.out.println((1+i)*i/2+j+1);
//					return;
//				}
//			}
//		}
//		scan.close();
//	}
	static int n=100000000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 16; ; i--) {
			if(check(i)) {
				break;
			}
		}
		System.out.println(C(32, 16));
		scan.close();
	}
	
	public static long C(int a, int b) {
		long res = 1;
		for (int i=a, j=1; j<=b; i--,j++) {
			res = res*i/j;
			if(res>n) return res;
		}
		return res;
	}
	
	public static boolean check(int k) {
		int L = 2*k, R = Math.max(n, L);
		while(L < R) {
			int mid = L+R >> 1;
			if(C(mid, k)>=n) R = mid;
			else L = mid+1;
		}
		if(C(R,k)!=n) {
			return false;
		}
		System.out.println(1L*R*(R+1)/2 + k+1);
		return true;
	}
}
