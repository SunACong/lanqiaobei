package practice;

import java.util.ArrayList;

public class D212SuperPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> allNum = getAllNum();
		for (Integer integer : allNum) {
			if (isPrime(integer)) {
				// 判断字串是否为质数
				System.out.println(integer);
			}
		}
	}
	
	public static boolean 	isPrime(int n) {
	    if (n <= 3) {
	        return n > 1;
	    }
	    // 只有6x-1和6x+1的数才有可能是质数
	    if (n % 6 != 1 && n % 6 != 5) {
	        return false;
	    }
	    // 判断这些数能否被小于sqrt(n)的奇数整除
	    int sqrt = (int) Math.sqrt(n);
	    for (int i = 5; i <= sqrt; i += 6) {
	        if (n % i == 0 || n % (i + 2) == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static ArrayList<Integer> getAllNum() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 三位
		for (Integer bai : new Integer[] {3, 5, 7}) {
			for (Integer shi : new Integer[] {3, 5, 7}) {
				for (Integer ge : new Integer[] {3, 7}) {
					list.add(bai*100+shi*10+ge);
				}
			}
		}
		// 两位
		for (Integer shi : new Integer[] {3, 5, 7}) {
			for (Integer ge : new Integer[] {3, 7}) {
				list.add(shi*10+ge);
			}
		}
		// 一位
		for (Integer ge : new Integer[] {3, 5, 7}) {
			list.add(ge);
		}
		return list;
	}

}
