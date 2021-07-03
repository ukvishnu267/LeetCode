package may1stweekLeetcode;

public class NondecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NondecreasingArray  obj = new NondecreasingArray();
		int nums[] = {1,2,3};
		boolean ans= obj.checkPossibility(nums);
		System.out.println(ans);

	}

	public boolean checkPossibility(int[] nums) {
		
		int change = 0;
		if (nums.length==1) return true;
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i-1]>nums[i]) {
				
				change++;
				if(change > 1) return false;
				
				if(i<2 || nums[i-2]<=nums[i]) nums[i-1] = nums[i];
				else
					nums[i]=nums[i-1];
			}
		}
		

		return true;

	}

}
