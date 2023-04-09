package practice03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T551D321 {
	static int[][] dir = {{1,0}, {0, 1}, {-1,0}, {0,-1}};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int num = scan.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < num; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			set.add((x-1)*col+y-1);
		}
		int k = scan.nextInt();
		for (int n = 0; n < k; n++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(Integer m : set) {
				int x = m/col;
				int y = m%col;
				for (int j2 = 0; j2 < 4; j2++) {
					if(x+dir[j2][0]>=0 && x+dir[j2][0]<=row-1 && y+dir[j2][1]>=0 && y+dir[j2][1]<=col-1) {
						list.add((x+dir[j2][0])*col+y+dir[j2][1]);
					}
				}
			}
			for (int i = 0; i < list.size(); i++) {
				set.add(list.get(i));
			}
		}
		System.out.println(set.size());
		scan.close();
	}
}
