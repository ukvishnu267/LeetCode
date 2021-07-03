package biweeklyContest55;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 obj = new Test1();
		int[] n = {2,3,1,2};
		System.out.println(obj.canBeIncreasing(n));
		
	}

	public boolean canBeIncreasing(int[] nums) {

		int count = 0;

	    int in = -1;
	    int n = nums.length;
	    for(int i = 1; i < n ; i++)
	    {
	        if (nums[i - 1] >= nums[i]) {
	        	count++; in = i;
	        }
	           
	        
	    }
	 //System.out.println(count);
	    if (count > 1)return false;
	 
	    if (count == 0) return true;

	    if (in == n - 1 || in == 1) return true;
	 
	    if (nums[in - 1] < nums[in + 1]) return true;
	 
	    if (nums[in - 2] < nums[in]) return true;
	 
	    return false;
		
	}

}
