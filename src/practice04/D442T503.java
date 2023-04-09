package practice04;

import java.util.*;


public class D442T503 {
	static int[][] point = new int[10010][2];
	static double[][] cha = new double[10010][2];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			point[i][0] = scan.nextInt();
			point[i][1] = scan.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			boolean flag = true;
			for (int j = 1; j < i; j++) {
				if (point[j][0] == point[i][0] && point[j][1] == point[i][1]) {
					flag = false;
				}
			}
			if (!flag) {
				continue;
			}
			if (i==1) {
				sum = 2;
			}else {
				sum += getSum(i);
			}
		}
		System.out.println(sum);
	}

	public static int getSum(int n) {
		int sum = 1;
		for (int i = 1; i < n; i++) {
			if (point[i][0] == point[n][0]) {
				continue;
			}
			cha[i][0] = (point[i][1]-point[n][1])*1.0/(point[n][0]-point[i][0]);
			cha[i][1] = point[i][0]*cha[i][0]+point[i][1];
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (cha[i][0]-cha[j][0]<0.00001 && cha[i][0]-cha[j][0]>-0.00001 && cha[i][1]-cha[j][1]<0.00001 && cha[i][1]-cha[j][1]>-0.00001) {
					flag = false;
				}
			}
			if (flag) {
				sum++;
			}
		}
		return sum;
	}

}
