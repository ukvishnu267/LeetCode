package june1stweekLeetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
		int[] nu = {0,3,7,2,5,8,4,6,0,1};
		
		int ans = obj.longestConsecutive(nu);
		System.out.println(ans);
	}

	public int longestConsecutive(int[] nums) {

		Set<Integer> seq = new HashSet<>();
		
		for(int i:nums)
			seq.add(i);
		
		int c=0, max = 0;
		for(int i:nums) {
			c = 0;
			if(!seq.contains(i-1) ) {
				while(seq.contains(i++)) c++;
			}
			max = Math.max(max, c);
		}
		return max;
		
	}

}
