package practice03;

import java.util.*;

public class D331T1458 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Integer[] target = new Integer[n];
		for (int i = 0; i < n; i++) {
			target[i] = i+1;
		}
		int[] p = new int[m];
		int[] q = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = scan.nextInt();
			q[i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			if (p[i] == 0) {
				Arrays.sort(target, 0, q[i], new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2-o1;
					}			
				});
			}else {
				Arrays.sort(target, q[i]-1, m);
			}
		}
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]+" ");
		}
		scan.close();
	}
}
