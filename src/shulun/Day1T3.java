package shulun;

import java.util.*;

public class Day1T3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		a%=b;
		a*= quickPow(10, n-1,b);
		a%=b;
		System.out.print(a);
		for (int i = 0; i < 2; i++) {
			a*=10;
			System.out.print(a/b);
			a%=b;
		}
		scan.close();
	}
	
	public static int quickPow(int a,int b, int p){
	    int ans=1,base=a;
	    while(b != 0)
	    {
	        if(b%2==1)//µÈÓÚb%2==1
	        {
	            ans=ans*base%p;
	        }
	        base=base*base%p;
	        b = b >> 1;
	    }
	    return ans;
	}
	
	public static void primeDivide(int a){
	    int p = 2;
	    while(a > 0) {
	    	if (a%p == 0) {
				a = a/p;
				System.out.println(p);
			}else {
				p++;
			}
	    }
	}
}
