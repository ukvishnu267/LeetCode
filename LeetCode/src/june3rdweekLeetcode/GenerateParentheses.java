package june3rdweekLeetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 4;
		GenerateParentheses obj = new GenerateParentheses();
		
		List<String> ans = obj.generateParenthesis(n);
		for(String x:ans)
			System.out.println(x+ " ");
		
	}

	public List<String> generateParenthesis(int n) {

		List<String> ans = new ArrayList<>();
		helper(ans,"",0,0,n);
		return ans;
	}

	private void helper(List<String> ans, String str, int i, int j, int n) {
		// TODO Auto-generated method stub
		
		if(str.length() == 2*n) {
			ans.add(str);
			return;
		}
		if(i<n)
			helper(ans,str+"(",i+1,j,n);
		
		if(j<i)
			helper(ans,str+")",i,j+1,n);

			
	}

}
