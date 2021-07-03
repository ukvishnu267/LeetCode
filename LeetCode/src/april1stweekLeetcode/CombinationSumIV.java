package april1stweekLeetcode;

import java.util.Arrays;

public class CombinationSumIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3};
		int target = 4;

		CombinationSumIV obj = new CombinationSumIV();
		int ans = obj.combinationSum4(nums, target);
		System.out.println(ans);
	}

	int[] dp;

	public int combinationSum4(int[] nums, int target) {

		dp = new int[target + 1];
	
		Arrays.fill(dp, -1); 

		dp[0] = 1;

		helper(nums,target);
		return dp[target];

	}

	int helper(int[] nums, int target) {

		if (dp[target] > -1) {
			return dp[target];
		}

		int res = 0;

		for (int i : nums) {
			if (i <= target) {
				res += helper(nums, target - i);
			}
		}
		
		dp[target] = res;
		//System.out.println(res);
		return dp[target];

	}

}
