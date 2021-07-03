package interviewAssmnt05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test10 obj = new Test10();
		String digits = "23";
		List<String> ans = obj.letterCombinations(digits);
		ans.stream().forEach(System.out::println);
	}

	public List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		
		if (digits.isEmpty())
			return ans;
		
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
		ans.add("");
		
		while (ans.peek().length() != digits.length()) {
			String remove = ans.remove();
			String map = mapping[digits.charAt(remove.length()) - '0'];
			for (char c : map.toCharArray()) {
				ans.addLast(remove + c);
			}
		}
		
		return ans;
	}

}
