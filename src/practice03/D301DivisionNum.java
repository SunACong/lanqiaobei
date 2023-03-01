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
		if(target<num) return 0; // ��Ҫ�ֵ���С��Ҫ�ֵķ�����ֱ�ӷ���
		if(target == 1) return 1; // �ֵ���=1
		if(num == 1) return 1; // �ֵķ���=1
		return divisionNum(target-1, num-1) + divisionNum(target-num, num);
	}
}
