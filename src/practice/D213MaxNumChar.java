package practice;

import java.util.HashMap;
import java.util.Scanner;

public class D213MaxNumChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		char s = string.charAt(0);
		for (Character key : string.toCharArray()) {
			int num = 0;
			if (map.containsKey(key)) {
				num = map.get(key)+1;
				map.put(key, num);
			}else {
				num = 1;
				map.put(key, 1);
			}
			if (isMaxNumChar(max, num) == 1) {
				s = key;
				max = num;
			} else if (isMaxNumChar(max, num) == 2) {
				if (key < s) {
					s = key;
				}
			}
		}
		System.out.println(s);
		System.out.println(max);
		scanner.close();
	}
	
	public static int isMaxNumChar(Integer max, Integer num) {
		if (max > num) {
			return 0;
		}else if (max == num) {
			return 2;
		}else {
			return 1;
		}
	}

}
