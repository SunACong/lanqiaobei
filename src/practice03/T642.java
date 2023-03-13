package practice03;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class T642 {
	public static void main(String[] args) {
		String str = "012345678";
		HashSet<String> set = new HashSet<String>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(str, 0));
		while(!queue.isEmpty()) {
			Node poll = queue.poll();
			String cur = poll.s;
			int step = poll.t;
			if ("087654321".equals(cur)) {
				System.out.println(step);
				break;
			}
			int i = 0;
			for (i = 0; i < cur.length(); i++) {
				if(cur.charAt(i) == '0') {
					break;
				}
			}
			for (int j = i-2; j <= i+2; j++) {
				int k = (j+9)%9;
				if(i == k) continue;
				String nextStr = exchange(cur, i, k);
				if(!set.contains(nextStr)) {
					set.add(nextStr);
					queue.add(new Node(nextStr, step+1));
				}
			}
		}
	}

	static String exchange(String curStr, int i, int k) {
		char[] chars = curStr.toCharArray();
		char temp = chars[i];
		chars[i] = chars[k];
		chars[k] = temp;
		return new String(chars);
	}
}
class Node{
	String s;
	int t;
	public Node(String s, int t) {
		super();
		this.s = s;
		this.t = t;
	}
}