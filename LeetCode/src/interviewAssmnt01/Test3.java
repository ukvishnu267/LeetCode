package interviewAssmnt01;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 obj = new Test3();
		String str = "()()";
		
		String ans = obj.removeOuterParentheses(str);
		System.out.println(ans);
	}

	public String removeOuterParentheses(String S) {
		String ans = "";
		int j=0;
		for(int i=0;i<S.length();i++) {
			
			if(S.charAt(i)== '(')
				j++;
			
			if(j>1) {
				ans += S.charAt(i);
			}
			if(S.charAt(i)== ')')
				j--;
		}
		
		return ans;

	}

}
