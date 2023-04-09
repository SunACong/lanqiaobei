package bfsdfs;

import java.util.*;

public class Day2T1 {
	static char[][] map = new char[2][3];
	static int[][] vis = new int[2][3];
	static int[] a = new int[2];
	static int[] b = new int[2];
	static int[] k = new int[2];
	static int[][] dict = {{1,0}, {-1,0},{0,1},{0,-1}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		map[0] = scan.nextLine().toCharArray();
		map[1] = scan.nextLine().toCharArray();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == ' ') {
					a[0]=i;a[1]=j;
					vis[i][j] = 1;
				} else if (map[i][j] == 'A') {
					b[0]=i;b[1]=j;
				} else if (map[i][j] == 'B') {
					k[0]=i;k[1]=j;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(k));
		dfs(a, b, k, 0);
	}

	public static void dfs(int[] aa, int[] bb, int[] kk, int step) {
		if (aa[0] == b[0] && aa[1] == b[1] && bb[0] == a[0] && bb[1] == a[1]) {
			System.out.println(step);
			return;
		}
		for (int i = 0; i < dict.length; i++) {
			int x = kk[0]+dict[i][0];
			int y = kk[1]+dict[i][0];
			if (x>=0 && x<=2 && y>=0 && y<=1 && vis[x][y]==0) {
				vis[x][y] = 1;
				if (map[x][y] == 'A') {
					aa[0] = kk[0];aa[1] = kk[1];
				}else if (map[kk[0]][kk[1]] == 'A') {
					bb[0] = kk[0];bb[1] = kk[1];
				}
				kk[0] = x;kk[1] = y;
				dfs(aa, bb, kk, step+1);
				vis[x][y] = 0;
			}
		}
	}
	
	public static void bfs(char[][] ditu) {
		new LinkedList<>
	}
}
