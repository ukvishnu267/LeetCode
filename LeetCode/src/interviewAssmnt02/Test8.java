package interviewAssmnt02;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test8 onj = new Test8();
		int[] heights = {1,1,4,2,1,3};
		onj.heightChecker(heights);
	}

	public int heightChecker(int[] heights) {

		
		int ans=0;
		int expected[] = heights.clone();
		/*
		 * Arrays.sort(expected); for(int i:heights) System.out.print(i+ " ");
		 * 
		 * System.out.println(); for(int i:expected) System.out.print(i+ " ");
		 */
		
		for(int i=0;i<heights.length;i++) {
			if(heights[i] != expected[i])
				ans++;
		}
		
		return ans;
	}

}
