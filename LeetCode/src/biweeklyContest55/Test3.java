package biweeklyContest55;

import java.util.LinkedList;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] q = {5,6,7,8};
		Test3 obj = new Test3();
		long ans = obj.maxAlternatingSum(q);
		System.out.println(ans);
	}

	public long maxAlternatingSum(int[] nums) {
		long odd = 0, even = 0;int i=0;
				
		for (int a : nums) {
			even = Math.max(even, odd + a);
			odd = even - a;
			System.out.println("********"+ i);
			System.out.println("even is "+even);
			System.out.println("Odd is "+odd );
			i++;
		}
		return even;
	}

}
