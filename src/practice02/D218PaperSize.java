package practice02;

import java.util.Scanner;

public class D218PaperSize {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String string = scan.next();
        int leng = 1189;
        int width = 841;
        int num = Integer.parseInt(string.substring(1));
        for (int i = 0; i < num; i++) {
			if(leng > width) {
				leng = (int)Math.floor(leng/2);
			}else {
				width = (int)Math.floor(width/2);
			}
		}
        
        System.out.println(leng>width?leng:width);
        System.out.println(leng>width?width:leng);
        scan.close();
    }

}
