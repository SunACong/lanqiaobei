package practice;

import java.util.Arrays;
import java.util.Scanner;

public class D216AddArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        //�ڴ��������Ĵ���...
		char[][] str = new char[30][50];
		for (int i = 0; i < 30; i++) {
			char[] ch = scan.nextLine().toCharArray();
			str[i] = ch;
			System.out.println(Arrays.toString(ch));
		}
		int result = 0;
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 50; j++) {
				char oneChar = str[i][j];
				// ͬһ��
				for (int col = j+1; col < 50; col++) {
					if(oneChar < str[i][col]) {
						result += 1;
					}
				}
				// ͬһ��
				for (int row = i+1; row < 30; row++) {
					if(oneChar < str[row][j]) {
						result += 1;
					}
				}
				// ����
				for (int row = i+1, col = j+1; row < 30 && col < 50; row++,col++) {
					if(oneChar < str[row][col]) {
						result += 1;
					}
				}
				// ����
				for (int row = i+1, col = j-1; row < 30 && col >= 0; row++,col--) {
					if(oneChar < str[row][col]) {
						result += 1;
					}
				}
				// ����
				for (int row = i-1, col = j+1; row >= 0 && col < 50; row--,col++) {
					if(oneChar < str[row][col]) {
						result += 1;
					}
				}
			}
		}
		System.out.println(result);
        scan.close();
		
	}

}
