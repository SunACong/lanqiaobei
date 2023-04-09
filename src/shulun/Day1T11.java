package shulun;

public class Day1T11 {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 4; i <= 2020; i++) {
			if (!isprime(i)) {
				res++;
			}
		}
		System.out.println(res);
	}
	
	private static boolean isprime(int x) {
		if (x<=3) {
			return x>1;
		}
		if(x%6!=5 && x%6!=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x%(i+2)==0 || x%i==0) {
				return false;
			}
		}
		return true;
	}
}
