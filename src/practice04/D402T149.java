package practice04;

import java.util.*;

public class D402T149 {
	static Queue<WeiZhi> queue = new LinkedList<WeiZhi>();
	static int[][] dict = {{-1,0}, {1,0}, {0,1}, {0,-1}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] vis = new int[n][m];
		char[][] map = new char[n][m];
		for (int i = 0; i < n; i++) {
			map[i] = scan.next().toCharArray();
			for (int j = 0; j < map[i].length; j++) {
				if ('g' == map[i][j]) {
					queue.offer(new WeiZhi(i*1000+j, 0));
					vis[i][j] = 1;
				}
			}
		}
		int k = scan.nextInt();
		while (!queue.isEmpty()) {
			WeiZhi weiZhi = queue.poll();
			int x = weiZhi.wz/1000;
			int y = weiZhi.wz%1000;
			int month = weiZhi.month;
			if (month < k) {
				month+=1;
				for (int i = 0; i < dict.length; i++) {
					int x1 = x+dict[i][0];
					int y1 = y+dict[i][1];
					if (x1>=0 && x1<n && y1>=0 && y1<m&&vis[x1][y1]!=1) {
						vis[x1][y1]=1;
						queue.offer(new WeiZhi(x1*1000+y1, month));
					}
				}
			}
		}
		for (int i = 0; i < vis.length; i++) {
			for (int j = 0; j < vis[i].length; j++) {
				if (vis[i][j] == 1) {
					System.out.print("g");
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		//在此输入您的代码...
		scan.close();
	}
}
class WeiZhi{
	int wz;
	int month;
	public WeiZhi(int wz, int month) {
		super();
		this.wz = wz;
		this.month = month;
	}
	@Override
	public String toString() {
		return "WeiZhi [wz=" + wz + ", month=" + month + "]";
	}
	
}
