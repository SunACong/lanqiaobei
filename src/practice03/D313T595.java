package practice03;

import java.util.LinkedList;
import java.util.Queue;

public class D313T595 {
	static int ans = 0;
	static boolean[] flag = new boolean[7];  // 七段码点亮情况
	static boolean[] vis = new boolean[7];	// 是否已经搜过了
	static int[][] mp = new int[7][7];
	public static void main(String[] args) {
		mp[0][1] = mp[0][5] = 1;
		mp[1][0] = mp[1][2] = mp[1][6] = 1;
		mp[2][1] = mp[2][3] = mp[2][6] = 1;
		mp[3][2] = mp[3][4]  = 1;
		mp[4][3] = mp[4][5] = mp[4][6] = 1;
		mp[5][4] = mp[5][0] = mp[5][6] = 1;
		mp[6][1] = mp[6][2] = mp[6][4] = mp[6][5] = 1;
		for (int i = 0; i < (1<<7); i++) {
			if(check(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	static boolean check(int x) {
		for (int j = 0; j < 7; j++) {
			flag[j] = vis[j] = false;
		}
		int cnt = 0;
		for (int j = 6; j >= 0; j--) {
	       if ((x >> j & 1) != 0) {
	           flag[j] = true;
	       }
	   }
		for (int j = 0; j < 7; j++) {
			if(flag[j] && !vis[j]) {
				bfs(j);
				cnt++;
			}
		}
		return cnt == 1;
	}
	static void bfs(int x) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(x);
		vis[x] = true;
		while(!queue.isEmpty()) {
			Integer num = queue.poll();
			for (int i = 0; i < 7; i++) {
				if(mp[num][i] != 0 && flag[i] && !vis[i]) {
					vis[i] = true;
					queue.offer(i);
				}
			}
		}
	}

}
