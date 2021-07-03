package may3rdweekLeetcode;

import java.util.ArrayList;
import java.util.List;

public class FindandReplacePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] w = {"abc","deq","mee","aqq","dkd","ccc"};
		String p = "abb";
		
		FindandReplacePattern obj = new FindandReplacePattern();
		List<String> ans =obj.findAndReplacePattern(w, p);
		
		for(String x: ans)
			System.out.println(x+" ");
	}

	public List<String> findAndReplacePattern(String[] words, String pattern) {

		List<String> ans = new ArrayList<>();
		
		for(String x:words) {
			if(matches(x,pattern)) {
				ans.add(x);
			}
		}
		
		return ans;
		
	}

	private boolean matches(String x, String p) {
		// TODO Auto-generated method stub
		
		char[] ptw = new char[26];
		char[] wtw = new char[26];
		
		for(int i =0;i<x.length();i++) {
			char wo = x.charAt(i);
			char po = p.charAt(i);
			
			if(ptw[po-'a'] == 0) {
				ptw[po-'a'] = wo;
			}
			if(wtw[wo-'a'] == 0) {
				wtw[wo-'a'] = po;
			}
			
			
			if(ptw[po-'a'] != wo || wtw[wo-'a'] != po) {
				return false;
			}
		}
		return true;
	}

}
