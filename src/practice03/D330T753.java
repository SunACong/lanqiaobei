package practice03;

import java.util.Scanner;

public class D330T753 {
	static int n = 0;
	static int k = 0;
	static int cnt = 0;
	static int add = 0;
	static int[] vis;
	static int[] nums;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		vis = new int[n+1];
		nums = new int[n+1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		dfs(1, 0);
		System.out.println(cnt);
		scan.close();
	}
	
	public static void dfs(int dep, int e) {
		if (dep == k) {
			if (isPrime(add)) {
				cnt++;
			}
			return;
		}
		for (int i = e; i <= n; i++) {
			vis[i] = 1;
			add+=nums[i];
			dfs(dep+1, i+1);
		}
	}
	
	
	public static boolean isPrime(int x) {
		if(x <= 3) {
			return x > 1;
		}
		if (x%6!=1 && x%6!=5) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(x); i+=6) {
			if (x%i == 0 || x%(i+2) == 0) {
				return false;
			}
		}
		return true;
	}
}
