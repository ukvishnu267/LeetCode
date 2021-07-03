package weeklyContest239;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj = new test1();
		int[] nums = {1};
		int target=1,start=0;
		int ans = obj.getMinDistance(nums, target, start);
		System.out.println(ans);

	}

	public int getMinDistance(int[] nums, int target, int start) {
		int ans=Integer.MAX_VALUE;
		int min = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				min = Math.abs(i -start);
				if(min<ans)
					ans= min;
			}
		}
		
		return ans;

	}

}
