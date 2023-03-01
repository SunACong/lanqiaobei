package practice03;

import java.util.Scanner;

public class D301CalculationNum {
	static int res = 1;
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int target = scan.nextInt();
        calNum(target);
        System.out.println(res);
        scan.close();
    }
	
	public static void calNum(int target) {
		if(target == 1) {
			return;
		}
		for (int i = 1; i <= target/2; i++) {
			res++;
			calNum(i);
		}
	}
}	
