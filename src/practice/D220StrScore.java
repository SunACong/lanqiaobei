package practice;

import java.util.Scanner;

public class D220StrScore {
	public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        int result = 0;
        for (int i = 1; i <= str.length(); i++) {
        	String word = new String();
			for (int j = 0; j <= str.length()-i; j++) {
				word = str.substring(j, j+i);
				result += getScore(word);
				
			}
		}
        System.out.println(result);
        cin.close();
    }
	
	public static int  getScore(String word) {
		int[] dict = new int[26];
		int result= 0;
		for (char chr : word.toCharArray()) {
			dict[chr-97]++;
		}
		for (int i : dict) {
			if (i == 1) {
				result += 1;
			}
		}
		return result;
	}
}
