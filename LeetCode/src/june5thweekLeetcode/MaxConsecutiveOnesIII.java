package june5thweekLeetcode;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,1,1,1,0,1,0,1,1,0,0,0,0};
		int k=2;
		System.out.println(new MaxConsecutiveOnesIII().longestOnes(nums, k));
	}

	public int longestOnes(int[] nums, int k) {

		int l = nums.length;
		int s=0, cur=0;
		while(cur < l ) {
			if(nums[cur] == 0) {
				k--;
			}
			
			if(k<0) {
				if(nums[s] == 0)
					k++;
				
				s++;
			}
			cur++;
		}
		return cur-s;
	}

}
