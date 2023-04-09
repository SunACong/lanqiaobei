package shulun;

public class Day1T7 {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 1; i <= 1200000; i++) {
			if (1200000%i==0) {
				res++;
			}
		}
		System.out.println(res);
	}
}
