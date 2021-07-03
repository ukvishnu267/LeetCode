package interviewAssmnt01;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test15 obj = new Test15();
		
		String ransomNote = "vishnu", magazine = "hnuunnikrishnanis";
		boolean ans = obj.canConstruct(ransomNote, magazine);
		System.out.println(ans);
	}
	
public boolean canConstruct(String r, String m) {
	
	int[] arr = new int[26];
	for(int i=0;i<m.length();i++) {
		arr[m.charAt(i)-'a']++;
		
	}
	
	for(int i=0;i<r.length();i++) {
		if(arr[r.charAt(i)-'a'] > 0)
			arr[r.charAt(i)-'a']--;
		else{
			return false;
		}
		
	}
	return true;
        
    }

}
