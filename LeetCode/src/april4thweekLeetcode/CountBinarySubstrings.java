package april4thweekLeetcode;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countBinarySubstrings(String s) {
		int cnt=0, i=1,prev=0,cur=1;
		
		while(i < s.length()) {
			
			if(s.charAt(i) != s.charAt(i-1)) {
				
				cnt += Math.min(prev, cur);
				prev = cur;
				cur = 1;
			}else {
				cur++;
			}
			i++;
		}
		return cnt += Math.min(prev, cur);
        
    }

}
