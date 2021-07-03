package interviewAssmnt03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		Test1 obj = new Test1();
		int ans = obj.lengthOfLongestSubstring(s);
		System.out.println(ans);
	}

	public int lengthOfLongestSubstring(String s) {
		

        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;

	}

}
