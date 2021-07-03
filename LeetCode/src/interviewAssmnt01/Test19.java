package interviewAssmnt01;

import java.util.Arrays;
import java.util.List;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test19 obj = new Test19();
		
		String s = "applepenapple";
		List<String >dict = Arrays.asList("apple","epen", "appl");
		boolean ans = obj.wordBreak(s, dict);
		
		System.out.println(ans);

	}
	
	 public boolean wordBreak(String s, List<String> dict) {
         boolean[] f = new boolean[s.length() + 1];
        
        f[0] = true;
         for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
            	System.out.println(s.substring(j, i));
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    System.out.println("-------"+s.substring(j, i));
                    break;
                }
            }
        }
        
        return f[s.length()];
    }

}
