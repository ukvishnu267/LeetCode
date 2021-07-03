package may3rdweekLeetcode;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinimumMovestoEqualArrayElementsII obj = new MinimumMovestoEqualArrayElementsII();

		int[] nums = { 1, 10, 2, 9 };

		int ans= obj.minMoves2(nums);
		
		System.out.println(ans);
	}

	public int minMoves2(int[] nums) {
		int ans = 0;
        Arrays.sort(nums);

		int n = nums.length;
		
		int median = n/2==0 ? (nums[n/2]+nums[n/2-1])/2  : nums[n/2];
		
		for(int x:nums)
			ans += Math.abs(median - x);
		
		return ans;

	}
}
