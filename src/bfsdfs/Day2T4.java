package bfsdfs;

public class Day2T4 {
	static int[][] map = new int[4][4];
	static int[][] dir = { { 1, 0 }, {-1, 0}, {0, 1}, {0, -1} };
	static int res = 0;
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				map[i][j] = 1;
				dfs(i, j, 0);
				map[i][j] = 0;
			}
		}
		System.out.println(res);
	}
	
	private static void dfs(int x ,int y, int index) {
		if (index == 15) {
			res++;
			return;
		}
		for (int i = 0; i < dir.length; i++) {
			int xx = x+dir[i][0];
			int yy = y+dir[i][1];
			if (xx>=0 && xx<4 && yy>=0 && yy<4 && map[xx][yy]==0) {
				map[xx][yy]=1;
				dfs(xx, yy, index+1);
				map[xx][yy]=0;
			}
		}
	}
}
