package interviewAssmnt05;

import java.util.Stack;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test11 obj = new Test11();
		int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
		int ans = obj.trap(h);
	}

	public int trap(int[] height) {
		
		int ans = 0, current = 0;
	    Stack<Integer> st = new Stack<>();
	    while (current < height.length) {
	        while (!st.empty() && height[current] > height[st.peek()]) {
	            int top = st.peek();
	            st.pop();
	            if (st.empty())
	                break;
	            int distance = current - st.peek() - 1;
	            int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
	            ans += distance * bounded_height;
	        }
	        st.push(current++);
	    }
	    return ans;
	    
	}

}
