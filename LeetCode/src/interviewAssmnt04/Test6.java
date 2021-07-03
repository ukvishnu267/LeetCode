package interviewAssmnt04;

import java.util.HashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test6().minSteps("anagram", "mangaar");
	}

	public int minSteps(String s, String t) {

		Map<Character,Integer> mp = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i), 0) + 1);
		}
		

		int cnt=0;
		for(int i=0;i<t.length();i++) {
			if(mp.containsKey(t.charAt(i)) && mp.get(t.charAt(i))>0 ){
				mp.put(t.charAt(i), mp.get(t.charAt(i)) - 1);
			}else {
				cnt++;
				//System.out.println(t.charAt(i));
			}
		}
		
		System.out.println(cnt);
		return cnt;
		
	}

}
