package practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class D216CargoPlacement {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = 2021041820210418l;
        ArrayList<Long> list = new ArrayList<Long>();
        for (long i = 1; i < Math.sqrt(num); i++) {
			if (num%i == 0) {
				list.add(i);
				if(num/i != i) {
					list.add(num/i);
				}
			}
		}
        int result = 0;
        for (Long i : list) {
			for (Long j : list) {
				for (Long k : list) {
					if(i*j*k == num) {
						result += 1;
					}
				}
			}
		}
        System.out.println(result);
        scan.close();
    }

}
