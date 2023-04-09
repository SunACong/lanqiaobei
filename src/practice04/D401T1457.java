package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class D401T1457 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		long[] a = new long[1000];
		a[0] =1;
		long[] b = new long[1000];
		for (int i = 0; i < a.length; i++) {
			b[0] = a[0];
			for (int j = 1; j <= i; j++) {
				b[j] = a[j-1]+a[j];
				if (b[j] == c) {
					System.out.println((1+i)*i/2+j+1);
					return;
				}
			}
			for (int j = 0; j < a.length; j++) {
				a[j]= b[j];
			}
		}
		scan.close();
	}
}
