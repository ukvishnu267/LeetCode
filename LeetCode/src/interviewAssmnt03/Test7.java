package interviewAssmnt03;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "dddccdbba";
		Test7 obj = new Test7();
		int ans = obj.firstUniqChar(s);
		System.out.println(ans);
	}

	public int firstUniqChar(String s) {

		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();  

		for(int i=0;i<s.length();i++) {
			
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		char ans = 0;
		for (Map.Entry<Character,Integer> pair : hm.entrySet()) {
			System.out.println(pair.getKey()+ " "+pair.getValue() );
			
			  if(pair.getValue() == 1) { ans = pair.getKey();break;}
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ans)
				return i;
		}
		return -1;
	}

}
