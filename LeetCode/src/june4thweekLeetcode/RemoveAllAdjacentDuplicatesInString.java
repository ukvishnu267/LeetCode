package june4thweekLeetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RemoveAllAdjacentDuplicatesInString().removeDuplicates("azxxzy");
	}

	public String removeDuplicates(String s) {

		Stack<Character> st = new Stack<>();
		
		for(char c:s.toCharArray()) {
			if(!st.isEmpty()) {
				char in = st.peek();
				
				if(c == in) {
					st.pop();
				}else {
					st.push(c);
				}
			}else {
				st.push(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty())
			sb.append(st.pop());
		
		System.out.println(sb.reverse().toString());
		return sb.reverse().toString();
		
	}

}
