package may4thweekLeetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumErasureValue obj = new MaximumErasureValue();
		int[] num = { 5, 2, 1, 2, 7, 2, 1, 2, 5 };
		int ans = obj.maximumUniqueSubarray(num);
		System.out.println(ans);
	}

	public int maximumUniqueSubarray(int[] nums) {
		int max = 0;
		int run = 0;
		Set<Integer> set = new HashSet<>();
		int i=0, st=0;
		while(i<nums.length) {
			int cur = nums[i];
			if(!set.contains(cur)) {
				set.add(cur);
				run += cur;
				max = Math.max(max, run);
				//System.out.println(max +" "+run);
				i++;
			}else {
				int rm = nums[st];
				//System.out.println("rm is "+rm);
				set.remove(rm);
				run -= rm;
				st++;
				
			}
			
		}
		
		
		return max;

	}

}
