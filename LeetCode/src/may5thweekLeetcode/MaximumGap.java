package may5thweekLeetcode;

import java.util.Arrays;

public class MaximumGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {10};
		MaximumGap obj = new MaximumGap();
		
		int ans = obj.maximumGap(num);
		System.out.println(ans);
	}

	public int maximumGap(int[] nums) {
		
		Arrays.sort(nums);
		int max=nums[0];
		for(int i=1;i<nums.length;i++) {
			max = max > (nums[i]-nums[i-1]) ?  max:nums[i]-nums[i-1];
		}

		return max;
	}
}
