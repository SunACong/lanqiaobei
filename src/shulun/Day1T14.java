package shulun;

public class Day1T14 {
	public static void main(String[] args) {
		int res = 0;
		long x = 0;
		while (res < 100002) {
			
			if (isprime(x)) {
				res++;
			}
			x++;
		}
		System.out.println(x-1);
	}
	private static boolean isprime(long x) {
		if (x<=3) {
			return x>1;
		}
		if (x%6!=5 && x%6!=1) {
			return false;
		}
		for (long i = 5; i <= Math.sqrt(x); i+=6) {
			if (x%(i+2)==0 || x%i==0)  {
				return false;
			}
		}
		return true;
	}
}
