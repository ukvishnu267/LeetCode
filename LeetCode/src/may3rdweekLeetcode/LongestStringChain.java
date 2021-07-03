package may3rdweekLeetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = {"a","b","ba","bca","bda","bdca"};
		LongestStringChain obj = new LongestStringChain();
		
		int ans = obj.longestStrChain(s);
		System.out.println(ans);
	}

	public int longestStrChain(String[] words) {

		Map<String,Integer> dp = new HashMap<>();
		
		Arrays.sort(words, (a,b)-> a.length()-b.length());
		int res=  0;
		
		for(String w:words) {
			
			int max =0 ;
			for(int i=0;i<w.length();i++) {
				String prev = w.substring(0, i) + w.substring(i+1);
				max = Math.max(max, dp.getOrDefault(prev, 0) + 1);
				
			}
			dp.put(w, max);
			res = Math.max(res, max);
		}
		
		return res;
		
	}

}
