package practice03;

public class D330T2131 {
//	@SuppressWarnings("unused")
	public static void main(String[] args) {
		long[] a ={0, 0,
                1, 2, 1, 4, 5, 4, 1, 2, 9, 0, 5, 10,
                11, 14, 9, 0, 11, 18, 9, 11, 11, 15, 17, 9,
                23, 20, 25, 16, 29, 27, 25, 11, 17, 4, 29, 22,
                37, 23, 9, 1, 11, 11, 33, 29, 15, 5, 41, 46};
		long k = 2;
		long ans = 3;
		for (int i = 3; i < a.length; i++) {
			while(true){
				if (ans%i == a[i]) {
					k = lcm(k, i);
					break;
				}else {
					ans+=k;
				}
			}
		}
		System.out.println(ans);
	}
	
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static long lcm(long a,long b) {
		return a/gcd(a, b)*b;
	}
}
