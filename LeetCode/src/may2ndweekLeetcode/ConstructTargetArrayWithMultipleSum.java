package may2ndweekLeetcode;

import java.util.PriorityQueue;

public class ConstructTargetArrayWithMultipleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructTargetArrayWithMultipleSum obj = new ConstructTargetArrayWithMultipleSum();
		
		int[] target = {9,3,5};
		boolean ans = obj.isPossible(target);
		
		System.out.println(ans);
	}

	public boolean isPossible(int[] target) {
		//boolean ans = false;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
		
		int total =0;
		for(int i: target) {
			total += i;
			pq.add(i);
		}
		
		while( !pq.isEmpty()) {
			
			int a = pq.poll();
			total -=a;
			
			if(a == 1 || total ==1) {
				return true;
			}
			if(a<total || total ==0 || a%total==0)
				return false;
			 a %=total;
			 total +=a;
			 pq.add(a);
		}
		
		return true;

	}
}
