package practice03;


public class T605D327 {
	public static void main(String[] args) {
		for (int i = 1; i <= 26; i++) {
			for (int j = 1; j <= 26; j++) {
				for (int k = 1; k <= 26; k++) {
					if(i*26*26+j*26+k == 2019) {
						char c1 = (char)(i+64);
						char c2 = (char)(j+64);
						char c3 = (char)(k+64);
						System.out.println(""+c1+c2+c3);
						return;
					}
				}
			}
		}
	}
}