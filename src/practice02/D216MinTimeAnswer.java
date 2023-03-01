package practice02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class D216MinTimeAnswer {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        People[] hPeoples = new People[num];
        for (int j = 0; j < num; j++) {
			int a = scan.nextInt();
			int i = scan.nextInt();
			int e = scan.nextInt();
			hPeoples[j] = new People(a, i, e);
		}
        Arrays.sort(hPeoples, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				if (o1.sum < o2.sum) {
					return -1;
				}else if (o1.sum > o2.sum) {
					return 1;
				}else if (o1.two > o2.two) {
					return 1;
				}else if (o1.two < o2.two) {
					return -1;
				}
				return 0;
			}
        	
		});
        long result = 0;
        long time = 0; // 上一个打卡时间
        for(int i = 0; i<num; i++) {
        	result += time + hPeoples[i].two;
        	time += hPeoples[i].sum;
        }
        System.out.println(result);
        scan.close();
    }
	
}

class People {
	int a;
	int i;
	int e;
	int sum;
	int two;
	public People(int a, int i, int e) {
		super();
		this.a = a;
		this.i = i;
		this.e = e;
		this.sum = a+i+e;
		this.two = a+i;
	}
	
}
