package shulun;

	import java.math.BigInteger;

public class Day1T4 {
	public static void main(String[] args) {
		BigInteger res = BigInteger.ZERO;
		BigInteger n = new BigInteger("2");
		for (int i = 0; i < 64; i++) {
			res = res.add(n.pow(i));
		}
		System.out.println(res);
	}
	private static long pow(long n, long m) {
		long res = 1;                     
		long base = n;                    
	    while(m != 0) {                  
	        if ((m&1) == 1) {            
	            res = res * base;        
	        }                            
	        base = base * base;          
	        m = m >> 1;                  
	    }                                
	    return res;                      
	}                        
	
	
	private static void primeDivide(int x) {
		int p = 2;
		while(x > 0) {
			if (x%p==0) {
				x/=p;
				System.out.println(p+" ");
			}else {
				p++;
			}
		}
	}
	
}
