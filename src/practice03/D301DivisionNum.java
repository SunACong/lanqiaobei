package practice03;

import java.util.Scanner;

public class D301DivisionNum {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int num = scan.nextInt();
        System.out.println(divisionNum(target, num));
        scan.close();
    }
	public static int divisionNum(int target, int num) {
		if(target<num) return 0; // 当要分的数小于要分的份数了直接返回
		if(target == 1) return 1; // 分的数=1
		if(num == 1) return 1; // 分的份数=1
		return divisionNum(target-1, num-1) + divisionNum(target-num, num);
	}
}
