package practice03;

import java.util.Scanner;

public class T552 {
	static int cnt = 0;
	static int n = 10;
	static int[] a = new int[10]; // 每行只能存储一个所以这个数组维护 每行存储皇后所在列 看别人解法理解了好久
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		dfs(1);
		System.out.println(cnt);
		scan.close();
	}
	
	public static void dfs(int row) {
		if(row == n+1) {
			cnt++;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (isEnbale(row, i)) {
				a[row] = i; // 维护第row行第i列为皇后的位置
				dfs(row+1);
				a[row] = 0;
			}
		}
	}
	
	public static boolean isEnbale(int row, int col){
		for (int i = 1; i < row; i++) {
			if(a[i] == col) return false;
			if(row-i == Math.abs(col-a[i]) && (row-i)<3) return false; // 左右两对角线
		}
		return true;
	}
}
