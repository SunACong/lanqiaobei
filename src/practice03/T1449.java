package practice03;

import java.util.HashSet;
import java.util.Scanner;

public class T1449 {
	static int[][] point = new int[420][2];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 21; j++) {
				point[index][0] = i;
				point[index][1] = j;
				index++;
			}
		}
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < point.length; i++) {
			for (int j = i+1; j < point.length; j++) {
				int x1 = point[i][0];
				int y1 = point[i][1];
				int x2 = point[j][0];
				int y2 = point[j][1];
				if(x1==x2 || y1==y2) {
					continue;
				}
				double k = (1.0*(y2-y1))/((x2-x1)*1.0);
				double b=(x2*y1-y2*x1)*1.0/(x2-x1)*1.0;
				set.add(""+k+""+b);
			}
		}
		System.out.println(set.size()+41);
		scan.close();
	}
}
