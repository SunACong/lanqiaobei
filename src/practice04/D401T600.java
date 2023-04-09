package practice04;

public class D401T600 {
	public static void main(String[] args) {
		int one=1,two=1,three=1;
		for (int i = 4; i <= 20190324; i++) {
			int four = (one+two+three)%10000;
			one = two;
			two = three;
			three = four;
		}
		System.out.println(three);
	}
}
