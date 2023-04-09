package bfsdfs;

import java.util.*;

public class Day2T3 {
	static char[][] map;
	static int[][] vis;
	static boolean flag;
	static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new char[N][N];
		vis = new int[N][N];
		int res = 0;
		for (int i = 0; i < N; i++) {
			map[i] = scan.next().toCharArray();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j]=='#' && vis[i][j]==0) {
					flag = true;
					dfs(i, j);
					if (flag) {
						res++;
					}
				}
			}
		}
		System.out.println(res);
	}
	private static void dfs(int i, int j) {
		vis[i][j]=1;
		if (map[i][j+1]=='#' && map[i][j-1]=='#'
				&& map[i-1][j]=='#' && map[i+1][j]=='#') {
			flag = false;
		}
		for (int k = 0; k < dir.length; k++) {
			int x = i+dir[k][0];
			int y = j+dir[k][1];
			if (map[x][y]=='#' && vis[x][y]==0) {
				dfs(x, y);
			}
		}
		
	}
}	
