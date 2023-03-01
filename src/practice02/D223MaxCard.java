package practice02;

import java.util.HashMap;

public class D223MaxCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
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
		for(int i=1;;i++) {
			String str = String.valueOf(i);
			for(char ch: str.toCharArray()) {
				if(map.get(ch) == 0) {
					System.out.println(i-1);
					return;
				}
				map.put(ch, map.get(ch)-1);
			}
		}
	}
	

}
