package practice02;

import java.util.Scanner;

public class D225NumCount {
	
	static int cnt = 0;
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        dfs(num);
        System.out.println(cnt);
        scan.close();
    }

	public static void dfs(int num) {
		cnt++;
		if(num == 1) return;
		for (int i = 1; i <= num/2; i++) {
			dfs(i);
		}
	}

}
