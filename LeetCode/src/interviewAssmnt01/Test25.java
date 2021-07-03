package interviewAssmnt01;

import java.util.HashSet;
import java.util.Set;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test25 obj = new Test25();
		String[] str = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		int ans = obj.numUniqueEmails(str);
		System.out.println(ans);
		
	}

	public int numUniqueEmails(String[] emails) {
		
		Set<String> ans = new HashSet<>();
			
		
		for(String s:emails) {
			//StringBuilder str = new StringBuilder();
			String[] snew = s.split("@");
			String s1 = snew[0], s2 = snew[1];
			if(s1.contains("+")) {
				int ind = s1.indexOf('+');
				s1 = s1.substring(0, ind);
			}
			
			if(s1.contains(".")) {
				s1 = s1.replace(".","");
			}
			System.out.println(s1+"@"+s2);
			ans.add(s1+"@"+s2);
			
		}

		
		return ans.size();
	}

}
