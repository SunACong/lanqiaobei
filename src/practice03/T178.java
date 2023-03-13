package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class T178 {
	static boolean flag = false;
	static char[][] mp;
	static boolean[][] vis;
	static int ans = 0;
	static int[][] dir = new int[][] {{1,0},{0,1},{-1,0},{0,-1}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		mp = new char[N][N];
		vis = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			mp[i] = scan.next().toCharArray();
		}
		for (int i = 0; i < mp.length; i++) {
			for (int j = 0; j < mp[i].length; j++) {
				if(mp[i][j] == '#' && !vis[i][j]) { 
					flag = false;
					dfs(i, j);
					if(!flag) ans++;
				}
			}
		}
		System.out.println(ans);
		scan.close();
	}
	
	static void dfs(int x, int y) {
		vis[x][y] = true;
		if(mp[x+1][y] == '#' && mp[x-1][y] == '#' &&
			mp[x][y+1] == '#' && mp[x][y-1] == '#') {
			flag = true;
		}
		for (int i = 0; i < dir.length; i++) {
			int xx = x+dir[i][0];
			int yy = y+dir[i][1];
			if(!vis[xx][yy] && mp[xx][yy] == '#') {
				dfs(xx, yy);
			}
		}
		
	}
}
