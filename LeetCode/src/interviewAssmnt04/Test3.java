package interviewAssmnt04;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findLengthOfLCIS(int[] nums) {

		int st=0;
		int en=1;
		int ans = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>nums[i-1]) {
				en ++;
			}
			else {
				st = i;
				en = i+1;
			}
			
			ans = Math.max(en-st, ans);
			
		}
		return ans;
	}

}
