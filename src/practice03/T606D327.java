package practice03;


public class T606D327 {
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 2019; i++) {
			for (int j = i+1; j < 2019; j++) {
				int k = 2019-i-j;
				if(k>j && !isHave(i) && !isHave(j) && !isHave(2019-i-j)) {
					sum+=1;
				}
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isHave(int num) {
		String str = ""+num;
		if (str.contains("2") || str.contains("4")) {
			return true;
		}
		return false;
	}
}
