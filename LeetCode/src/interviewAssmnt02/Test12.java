package interviewAssmnt02;

import java.util.HashMap;
import java.util.Map;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test12 obj = new Test12();
		int nums[] = {2,2,1,1,1,2,2} ;
		
		int ans = obj.majorityElement(nums);
		System.out.println(ans);
		
	}

	public int majorityElement(int[] nums) {
		
		int k = nums.length/2;
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i:nums) {
			hmap.put(i, hmap.getOrDefault(i, 0)+1);
			
		}
		int ans = 0;
		for (Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
			if( entry.getValue() > k) {
            	ans =  entry.getKey();
            }
		}
            
		return ans;

	}

}
