package practice03;

import java.util.Scanner;

public class T764D329 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		for (double i = -100; i <= 100; i+=0.01) {
			if (Math.abs(isRes(a, b, c, d, i)) < 0.000001) {
				System.out.printf("%.2f ", i);
			}
		}
		scan.close();
	}
	
	public static double isRes(double a, double b, double c,double d, double x) {
		double y = a*x*x*x+b*x*x+c*x+d;
		return y;
	}
}
