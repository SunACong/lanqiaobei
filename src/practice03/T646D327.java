package practice03;

public class T646D327 {
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			for (int j = 1; j < 10000; j++) {
				if (isPrime(i)) {
					int k;
					for (k = 0; k < 10; k++) {
						if (!isPrime(i+k*j)) {
							break;
						}
					}
					if(k==10) {
						System.out.println(j);
						return;
					}
				}
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if (num<=3) {
			return num>1;
		}
		if(num%6!=1 && num%6!=5) {
			return false;
		}
		for (int i = 5; i <= Math.sqrt(num); i+=6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
}
