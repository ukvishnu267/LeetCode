package leetCodePrac;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
		String s = "pwwkweqrw";
		int ans = obj.lengthOfLongestSubstring(s);
		System.out.println(ans);

	}

	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		for (int i = 0, j = 0; i < s.length(); ++i) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
				// System.out.println("j is "+j);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
			// System.out.println(s.charAt(i)+ " max is "+max);
		}
		return max;
	}

}
