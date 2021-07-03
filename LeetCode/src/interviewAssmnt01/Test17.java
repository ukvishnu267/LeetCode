package interviewAssmnt01;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test17 obj = new Test17();
		
		int[] nums = {1,7,3,6,5,6};
		int ans = obj.pivotIndex(nums);
		
		System.out.println(ans);
			
	}

	public int pivotIndex(int[] nums) {
		int sum = 0, left = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i];

		for (int i = 0; i < nums.length; i++) {
			if (i != 0)
				left += nums[i - 1];
			if (sum - left - nums[i] == left)
				return i;
		}

		return -1;
	}

}
