package practice0228;

import java.util.HashSet;
import java.util.Scanner;

public class D228ApproximateNum {
	
//	public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        HashSet<Integer> set = new HashSet<>();
//        int cnt = 0;
//        for (int i = 1; i <= 600000; i++) {
//			if(1200000%i == 0) {
//				if(!set.contains(i) || !set.contains(1200000/i)) {
//					set.add(i);
//					set.add(1200000/i);
//					cnt+=2;
//				}
//			}
//		}
//        System.out.println(cnt);
//        scan.close();
//    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(1200000); i++) {
			if(1200000%i == 0) {
				cnt+=2;
			}
		}
        System.out.println(cnt);
        scan.close();
    }
}
