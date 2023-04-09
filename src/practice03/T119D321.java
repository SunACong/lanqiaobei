package practice03;

import java.util.Scanner;

public class T119D321 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//在此输入您的代码...
		int num = scan.nextInt();
		int res = 0;
		for (int i = 1; i <= num; i++) {
			if(isHave(i)) {
				res+=i;
			}
		}
		System.out.println(res);
		scan.close();
	}
	
	public static boolean isHave(int num) {
		String str = String.valueOf(num);
		for(char s : str.toCharArray()) {
			if(s == '0' || s=='1' || s == '2' || s=='9') {
				return true;
			}
		}
		return false;
	}
}
