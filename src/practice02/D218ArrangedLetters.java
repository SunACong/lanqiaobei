package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class D218ArrangedLetters {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string ="WHERETHEREISAWILLTHEREISAWAY";
        char[] strsStrings = string.toCharArray();
        Arrays.sort(strsStrings);
        String s = "";
        for (char ch : strsStrings) {
			s += ch;
		}
        System.out.println(s);
        scan.close();
    }

}
