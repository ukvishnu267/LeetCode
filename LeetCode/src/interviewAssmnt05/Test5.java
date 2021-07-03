package interviewAssmnt05;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isAnagram(String s, String t) {

		if(s.length()!= t.length()) return false;
		
		int cons[] = new int[26];
		for(int i=0;i<s.length();i++) {
			cons[ s.charAt(i)- 'a'] ++;
			cons[ t.charAt(i)- 'a'] --;
		}
		
		for(int x:cons) {
			if(x!=0) return false;
		}
		
		return true;
		
	}
}
