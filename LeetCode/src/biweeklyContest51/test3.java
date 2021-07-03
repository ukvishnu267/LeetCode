package biweeklyContest51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 obj = new test3();
		int[] arr = {73,98,9};
		int ans = obj.maximumElementAfterDecrementingAndRearranging(arr);
		System.out.println(ans);

	}

	public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
		
		Arrays.sort(arr);
		int ans = 1;
		if(arr[0]!=1)
			arr[0] = 1;
			
		
		for(int i=1;i<arr.length;i++) {
			
			int val = arr[i] - arr[i-1];
			if(val<=1) {
				ans = arr[i];
			}
			else {
				arr[i] = arr[i-1]+1;
				ans = arr[i];
			}
		}
		return ans;

	}

}
