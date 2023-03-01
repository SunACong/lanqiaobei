package practice02;

import java.util.Scanner;

public class D218CalculationGrade {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        float hg = 0;
        float yx = 0;
        for(int i=0; i<num; i++) {
        	int one = scan.nextInt();
        	if(one >= 85) {
        		hg++;
        		yx++;
        	}else if(one >= 60) {
        		hg++;
        	}
        }
        System.out.println(""+Math.round(hg*100/num) + "%");
        System.out.println(""+Math.round(yx*100/num) + "%");
        scan.close();
    }

}
