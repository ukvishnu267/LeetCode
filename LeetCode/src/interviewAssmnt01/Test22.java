package interviewAssmnt01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,3,4,5,4,5,4,4,4,4};
		Test22 obj = new Test22();
		
		List<Integer> ans = obj.majorityElement(nums) ;
		
		for(int i :ans)
			System.out.println(i);
		
	}

	public List<Integer> majorityElement(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int inc = 1;
		for(int x:nums) {
			
			//map.getOrDefault(x, 1);
			map.put(x, map.getOrDefault(x, 0) + inc);
			
		}
		
		int n = nums.length/3;
		map.entrySet().removeIf(entry -> entry.getValue() <= n );
		
		List<Integer> ans = new ArrayList<Integer>(map.keySet());
			
			
			
		
		
		return ans;
		
		

	}
}
