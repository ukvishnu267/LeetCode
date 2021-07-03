package interviewAssmnt05;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 obj = new Test3();
		String s = "azzzzzz";
		int k = 2;
		String ans = obj.largestString(s, k);

		System.out.println(ans);
	}

	public String largestString(String str, int k) {

		char[] c = str.toCharArray();

		Stack<Character> st = new Stack<>();
		for (char s : c) {
			st.push(s);
		}

		StringBuilder sb = new StringBuilder();
		char cur = st.pop();
		sb.append(cur);
		
		Queue<Character> q= new LinkedList<>();
		while (!st.isEmpty()) {
			char next = st.pop();
			if(!q.isEmpty() ) {
				char top = q.peek();
				if(cur != top) {
					
				}
			}
			if (cur != next) {
				sb.append(next);
				
			} else {
				if (k > 0) {
					sb.append(next);
					k--;
				}else {
					q.offer(next);
				}
			}
			
			cur = next;
		}

	}

}
