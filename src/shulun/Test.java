package shulun;

import java.util.*;


public class Test {
	public static void main(String[] args) {
//		getprime(100);
//		System.out.println(isPrime(111));
//		System.out.println(quickPow(3, 20));
//		ass(10);
		
//		List<People> list = new ArrayList<People>();
//		People people1 = new People(10, 1);
//		People people2 = new People(9, 2);
//		People people3 = new People(8, 3);
//		People[] list1 = new People[3];
//		list1[0] = people1;
//		list1[1] = people2;
//		list1[2] = people3;
//		Arrays.sort(list1, new Comparator<People>() {
//
//			@Override
//			public int compare(People o1, People o2) {
//				// TODO Auto-generated method stub
//				return o1.age-o2.age;
//			}
//			
//		});
//		System.out.println(Arrays.toString(list1));
	}
	private static void getprime(int x) {
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x%i==0) {
				while(x%i==0) {
					x/=i;
					System.out.println(i+" ");
				}
			}
		}
		if (x>1) {
			System.out.println(x);
		}
	}
	private static boolean isPrime(int x) {
		if (x<=3) {
			return x>1;
		}
		if (x%6!=5 && x%6!=1) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(x); i+=6) {
			if (x%(i+2)==0 || x%i==0) {
				return false;
			}
		}
		return true;
	}
	private static long quickPow(int a, int b) {
		long res = 1,base = a;
		while(b>0) {
			if (b%2!=0) {
				res=res*base;
			}
			base = base*base;
			b=b>>1;
		}
		return res;
	}
	private static void ass(int x) {
		int[] map = new int[x+1];
		map[0] = map[1] = 1;
		for (int i = 2; i < map.length; i++) {
			if (map[i] != 1) {
				for (int j = i*2; j < map.length; j+=i) {
					map[j] = 1;
				}
			}
		}
		System.out.println(Arrays.toString(map));
	}
	
}
class People{
	int age;
	int step;
	public People(int age, int step) {
		super();
		this.age = age;
		this.step = step;
	}
	@Override
	public String toString() {
		return "People [age=" + age + ", step=" + step + "]";
	}
	
}