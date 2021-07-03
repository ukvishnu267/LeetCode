package may4thweekLeetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();
		
		String[] str = {"2","1","+","3","*"};
		
		int ans = obj.evalRPN(str);
		System.out.println(ans);
	}

	public int evalRPN(String[] tokens) {
		int ans = 0;
		
		Stack<Integer> nums = new Stack<>();
		int total = 0;
		for(String x:tokens) {
			if(x.equals("+") ||x.equals("-") ||  x.equals("/") || x.equals("*")) {
				int a2 = nums.pop(), a1= nums.pop();
				if(x.equals("+")) {
					total = a1+a2;
				}else if(x.equals("-")) {
					total = a1 - a2;
				}else if(x.equals("/")) {
					total = a1 / a2;
				}else {
					total = a1 * a2;
				}
				nums.push(total);
				
			}else {
				nums.push(Integer.valueOf(x));
			}
		}
		 ans = nums.pop();
		return ans;

	}

}
