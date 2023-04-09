package practice03;

public class T608D323 {
	public static void main(String[] args) {
		int N = 100000;
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			if (isPrime(i)) {
				sum++;
				if (sum == 2019) {
					System.out.println(i);
					return;
				}
			}
		}
	}
	
	public static boolean isPrime(int a) {
		if (a <= 3) {
			return a>1;
		}
		
		if(a%6!=5 & a%6!=1) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(a); i+=6) {
			if (a%i == 0 || a%(i+2) == 0) {
				return false;
			}
		}
		return true;
	}
}
