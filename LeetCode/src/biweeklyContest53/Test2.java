package biweeklyContest53;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj = new Test2();
		int[] num = {3,5,2,3};
		int ans = obj.minPairSum(num);
		System.out.println(ans);
	}

	public int minPairSum(int[] nums) {

		int max = 0;
		
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=0;i<n/2;i++) {
			
			max = Math.max(max, nums[n-i-1]+nums[i]);
		}
		
		return max;
	}

}
