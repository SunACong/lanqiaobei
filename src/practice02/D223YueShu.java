package practice02;

import java.awt.image.RescaleOp;
import java.util.HashSet;

public class D223YueShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1200000;
		int res = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=1;i<=600000;i++) {
			if(!set.contains(i) && !set.contains(num/i)){
				if(num%i == 0) {
					set.add(i);
					set.add(num/i);
					res+=2;
				}
			}
		}
		System.out.println(res);
	}

}
