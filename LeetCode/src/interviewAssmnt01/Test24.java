package interviewAssmnt01;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test24 obj = new Test24();
		int[] nums = {1,2,3,4};
		int[] ans = obj.productExceptSelf(nums);
		
		for(int i:ans)
			System.out.println(i);
	}
	
	public int[] productExceptSelf(int[] nums) {
	    int n = nums.length;
	    //System.out.println(n);
	    int[] res = new int[n];
	    res[0] = 1;
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	        //System.out.print(res[i]+ " ");
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    return res;
	}
}
