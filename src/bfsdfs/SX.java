package bfsdfs;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SX {

	static int[] map = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	static int[] b = new int[9];
	static boolean[] vis = new boolean[9];
	
	// 全排列
	private static void dfs(int s, int t) {
		if (s == t) {
			for (int i = 0; i < t; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = s; i < t; i++) {
			swap(map, s, i);
			dfs(s+1, t);
			swap(map, s, i);
		}
	}
	//顺序输出
	private static void dfsAll(int s, int t) {
		if (s==t) {
			for (int i = 0; i < t; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < t; i++) {
			if (!vis[i]) {
				vis[i] = true;
				b[s] = map[i];
				dfsAll(s+1, t);
				vis[i] = false;
			}
		}
	}
	// 组合
	private static void dfsZuHe(int k) {
		if (k == 5) {
			for (int i = 0; i < 5; i++) {
				if (vis[i]) {
					System.out.print(map[i]+" ");
				}
			}
			System.out.println();
		}else {
			vis[k] = false;
			dfsZuHe(k+1);
			vis[k] = true;
			dfsZuHe(k+1);
		}
	}
	// 连通性判断
	private static void bfs(int i, int j) {
		Queue<Integer> queue = new LinkedList<Integer>();
		// 队首进队
		// 标记队首已经看过
		while(!queue.isEmpty()) {
			// 弹出队首
			// 四个方向
				// 是否越界 是否看过 是否满足条件
					// 看过
					// 进队
		}
	}
	public static void main(String[] args) {
//		dfsZuHe(0);
//		System.out.println(Long.MAX_VALUE);
//		for (int i = 0; i < args.length; i++) {
//			for (int j = 0; j < args.length; j++) {
//				// 满足条件 是否看过
//					flag = 0;
//					bfs(i ,j);
//					if (flag!=0) {
//						res++;
//					}
//			}
//		}
		name();
	}
	
	public static void name() {
		LocalDateTime startTime = LocalDateTime.of(2022, 1, 20, 0, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2022, 1, 21, 0, 0, 0);
		while (!startTime.isAfter(endTime)) {
			DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String format = startTime.format(ofPattern);
			System.out.println(format);
//			DayOfWeek dayOfWeek = startTime.getDayOfWeek();
			startTime = startTime.plusSeconds(1);
		}
	}
	

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
