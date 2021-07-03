package interviewAssmnt05;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "loveleetcode";
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

		//LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		for(int i=0;i<s.length();i++) {
			System.out.println(hm.get(s.charAt(i)));
		}

		System.out.println(-1);
	}

}
