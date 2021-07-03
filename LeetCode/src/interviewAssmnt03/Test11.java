package interviewAssmnt03;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,5,6};
		int t = 0;
		Test11 obj = new Test11();
		int ans = obj.searchInsert(nums, t);
		System.out.println(ans);
	}

	public int searchInsert(int[] nums, int target) {

		int l =0;
		int h = nums.length-1;
		int m=0;
		
		
		while(l<=h) {
			 m = (l+h)/2;
			if(nums[m] == target) 
				return m;
			else if(nums[m]>target) {
				h = m-1;
				
			}else {
				l = m+1;
			}
		}
		//System.out.println(l+ " "+h);
		return l;
	}

}
