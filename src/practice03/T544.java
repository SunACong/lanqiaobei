package practice03;

import java.util.Scanner;
public class T544 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//在此输入您的代码...
		String str = scan.next();
		int t = scan.nextInt();
		int subLast = 0;
		int subCur = 0;
		while(subLast<t) {
			for (int i = 0; i < str.length()-1; i++) {
				if(str.charAt(i) > str.charAt(i+1)) {
					str = str.substring(0, i)+str.substring(i+1,str.length());
					subLast++;
					break;
				}
			}
			subCur++;
			if(subCur != subLast) {
				str = str.substring(0, str.length()-(t-subLast));
				break;
			}
		}
		System.out.println(str);
		scan.close();
	}
}
