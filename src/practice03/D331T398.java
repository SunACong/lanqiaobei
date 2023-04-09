package practice03;

import java.util.*;

public class D331T398 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int R = scan.nextInt();
		int Q = scan.nextInt();
		int[] initFen = new int[2*N];
		int[] initPower = new int[2*N];
		People[] list = new People[2*N];
		for (int i = 0; i < 2*N; i++) {
			initFen[i] = scan.nextInt();
		}
		for (int i = 0; i < 2*N; i++) {
			initPower[i] = scan.nextInt();
		}
		for (int i = 0; i < 2*N; i++) {
			list[i] = new People(i+1, initFen[i], initPower[i]);
		}
		for (int i = 0; i < R; i++) {
			Arrays.sort(list, new Comparator<People>() {
				@Override
				public int compare(People p1, People p2) {
					if (p2.fen == p1.fen) {
						return p1.id-p2.id;
					}
					return p2.fen-p1.fen;
				}
			});
			for (int j = 0; j < 2*N; j+=2) {
				if (list[j].power > list[j+1].power) {
					list[j].fen+=1;
				}else {
					list[j+1].fen+=1;
				}
			}
		}
		Arrays.sort(list, new Comparator<People>() {
			@Override
			public int compare(People p1, People p2) {
				if (p2.fen == p1.fen) {
					return p1.id-p2.id;
				}
				return p2.fen-p1.fen;
			}
		});
		System.out.println(list[Q-1].id);
		scan.close();
	}
}

class People {
	int id;
	int fen;
	int power;
	public People(int id, int init, int power) {
		super();
		this.id = id;
		this.fen = init;
		this.power = power;
	}
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", fen=" + fen + ", power=" + power + "]";
	}	
	
}