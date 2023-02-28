package practice0228;

import java.util.Scanner;

public class D228SpecialTime {
	public static void main(String[] args) {
		int[] days = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
        Scanner scan = new Scanner(System.in);
        int res = 0;
        for (int i = 0; i < 10; i++) { // 三个
        	for (int j = 0; j < 10; j++) { // 一个
    			if(i==j) continue;
    			int date=0;
    			int time=0;
    			for (int d = 0; d < 4; d++) {
    				int[] num = new int[] {i,i,i,i};
    				num[d] = j;
    				int mmdd = num[0]*10+num[1];
    				int hhmm = num[2]*10+num[3];
    				if(mmdd <= 12 && mmdd >= 1 && hhmm<=days[mmdd] && hhmm>=1) {
    					date++;
    				}
    				if(mmdd <= 23 && hhmm<=59) {
    					time++;
    				}
				}
    			res += 4*date*time;
    		}
		}
        System.out.println(res);
        scan.close();
    }
}
