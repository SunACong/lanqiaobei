package practice02;

import java.util.HashMap;
import java.util.Scanner;

public class D213GetMaxNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('0', 2021);
		map.put('1', 2021);
		map.put('2', 2021);
		map.put('3', 2021);
		map.put('4', 2021);
		map.put('5', 2021);
		map.put('6', 2021);
		map.put('7', 2021);
		map.put('8', 2021);
		map.put('9', 2021);
		int num = 1;
		while(true) {
			String s = ""+num;
			for (Character one : s.toCharArray()) {
				int h = map.get(one)-1;
				if(h == -1) { 
					System.out.println(num-1);
					return;
				}
				map.put(one, h);
			}
			num += 1;
		}
	}
}
