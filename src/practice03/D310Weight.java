package practice03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class D310Weight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		set.add(num[0]);
		for (int i = 1; i < num.length; i++) {
			Integer[] array = set.toArray(new Integer[set.size()]);
			for (int j = 0; j < array.length; j++) {
				if(!set.contains(num[i])) {
					set.add(num[i]);
				}
				set.add(array[j]+num[i]);
				set.add(Math.abs(array[j]-num[i]));
			}
		}
		if(set.contains(0)) {
			System.out.println(set.size()-1);
		}else {
			System.out.println(set.size());
		}
		scan.close();
	}
}
