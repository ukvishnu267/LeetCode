package interviewAssmnt02;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 obj = new Test5();
		int[] nu = {3,2,4};
		int t = 7; 
		int[] ans = obj.twoSum(nu, t);
		
	}

	public int[] twoSum(int[] nums, int target) {

		int a1=0,a2=0;
		boolean suc=false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				//System.out.println();
				if( target-nums[i] == nums[j]) {
					a1 = i;
					a2 = j;
					suc = true;
					break;
				}
				if(suc)
					break;
			}
		}
		int ans[] = {a1,a2};
		System.out.println(a1+" "+a2);
		return ans;
	}

}
