package practice03;

public class D310XiangCheng {
	public static void main(String[] args) {
		long res = 0;
		for (long i = 1; i <= 1000000007; i++) {
			if(i*2021%1000000007 == 999999999) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
