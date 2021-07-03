package june4thweekLeetcode;

import java.util.HashSet;

public class NumberofMatchingSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numMatchingSubseq(String s, String[] words) {

		HashSet<String> isSS = new HashSet<>();
		HashSet<String> isnotSS = new HashSet<>();
		
		int cnt=0;
		for(String w:words) {
			
			if(isSS.contains(w)) {
				cnt++;
			}else if(isnotSS.contains(w)){
				continue;
			}else {
				if(checkSS(s,w)) {
					cnt++;
					isSS.add(w);
				}else {
					isnotSS.add(w);
				}
			}
		}
		return cnt;
	}

	private boolean checkSS(String s, String w) {
		// TODO Auto-generated method stub
		int ind=0;
		for(char c:w.toCharArray()) {
			ind = s.indexOf(c, ind);
			if(ind == -1)
				return false;
			ind ++;
		}
		return true;
	}

}
