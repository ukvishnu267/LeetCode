package may1stweekLeetcode;

import java.util.Arrays;

public class JumpGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JumpGame2 obj = new JumpGame2();
		int num[] = {4,3,0,0,4};
		int ans = obj.jump(num);
		System.out.println(ans);

	}
	 public int jump(int[] nums) {
		 int ans=0;
		 int n = nums.length;
		 int dp[] = new int[n];
		 Arrays.fill(dp, Integer.MAX_VALUE);
		 
		 dp[n-1]= 0;
		 
		 for(int i = n-1;i>=0;i--) {
			 
			 int min = Integer.MAX_VALUE;
			 for(int j=i+1; j <= Math.min(n-1, i+nums[i]);j++) {
				 min = Math.min(min, dp[j]);
				 
			 }
			 if(min!= Integer.MAX_VALUE) {
				 dp[i] = min+1;
			 }
		 }
		 
		 return dp[0];
	    }

}
