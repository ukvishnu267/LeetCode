package june4thweekLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {5,2,6,1};
		CountofSmallerNumbersAfterSelf obj = new CountofSmallerNumbersAfterSelf();
		obj.countSmaller(num);

	}

	public List<Integer> countSmaller(int[] nums) {
		
		Integer[] ans = new Integer[nums.length];
		
		int[] bit = new int[20005];
		/*
		 * for(int i=0;i<nums.length;i++) { nums[i] +=10001; }
		 */
		
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]-1);
			ans[i] = answr(nums[i]-1,bit);
			update(nums[i],bit);
		}
		
		return Arrays.asList(ans);
		
	}

	private void update(int i, int[] bit) {
		// TODO Auto-generated method stub
		while(i<=bit.length) {
			bit[i]++;
			i += i& (-i);
		}
	}

	private int answr(int i, int[] bit) {
		// TODO Auto-generated method stub
		
		int ans =0;
		while(i>0) {
			ans +=bit[i];
			i -= i& (-i);
		}
		return ans;
	}

}
