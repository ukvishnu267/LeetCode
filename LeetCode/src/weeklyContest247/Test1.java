package weeklyContest247;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProductDifference(int[] nums) {

		Arrays.sort(nums);
		int l = nums.length;
		int a = nums[l-1],b=nums[l-2];
		int c = nums[0], d= nums[1];
		
		return(a*b)- (c*d);
	}

}
