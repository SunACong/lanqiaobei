package practice03;

public class T2488D325 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 2021; i++) {
			if(max(2021, i) == 4042) {
				sum+=1;
			}
		}
		System.out.println(sum);
	}
	
	public static int max(int a, int b) {
		return a*b/gcd(a, b);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
