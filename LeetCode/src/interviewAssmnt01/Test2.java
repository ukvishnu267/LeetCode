package interviewAssmnt01;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 obj = new Test2();
		
		int[] nums = {1,5,2,8};
		int ans = obj.arrayPairSum(nums);
		System.out.println(ans);

	}

	public int arrayPairSum(int[] nums) {
		
		int ans=0;
		
		Arrays.sort(nums);
		
		for(int i = 0;i<nums.length;i+=2)
			ans +=nums[i];
		
		return ans;

	}

}
