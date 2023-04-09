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
	
	// ȫ����
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
	//˳�����
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
	// ���
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
	// ��ͨ���ж�
	private static void bfs(int i, int j) {
		Queue<Integer> queue = new LinkedList<Integer>();
		// ���׽���
		// ��Ƕ����Ѿ�����
		while(!queue.isEmpty()) {
			// ��������
			// �ĸ�����
				// �Ƿ�Խ�� �Ƿ񿴹� �Ƿ���������
					// ����
					// ����
		}
	}
	public static void main(String[] args) {
//		dfsZuHe(0);
//		System.out.println(Long.MAX_VALUE);
//		for (int i = 0; i < args.length; i++) {
//			for (int j = 0; j < args.length; j++) {
//				// �������� �Ƿ񿴹�
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
