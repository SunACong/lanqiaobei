package bfsdfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day2T6 {
	static int row;
	static int col;
	static char[][] map;
	static int k;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt();
		col = scan.nextInt();
		map = new char[row][col];
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < row; i++) {
			map[i] = scan.next().toCharArray();
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 'g') {
					queue.offer(i*col+j);
					System.out.println(i + " " + j);
				}
			}
		}
		k = scan.nextInt();
		
//		for (int i = 0; i < map.length; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
//		System.out.println(k);
		
	}
}
