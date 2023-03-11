package practice03;

import java.util.Scanner;

public class T552 {
	static int cnt = 0;
	static int n = 10;
	static int[] a = new int[10]; // ÿ��ֻ�ܴ洢һ�������������ά�� ÿ�д洢�ʺ������� �����˽ⷨ����˺þ�
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
				a[row] = i; // ά����row�е�i��Ϊ�ʺ��λ��
				dfs(row+1);
				a[row] = 0;
			}
		}
	}
	
	public static boolean isEnbale(int row, int col){
		for (int i = 1; i < row; i++) {
			if(a[i] == col) return false;
			if(row-i == Math.abs(col-a[i]) && (row-i)<3) return false; // �������Խ���
		}
		return true;
	}
}
