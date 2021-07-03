package june1stweekLeetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumPerformanceofaTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sp = {2,10,3,1,5,8};
		int[] ef = {5,4,3,9,7,2};
		int n = 6,k=2;
		
		MaximumPerformanceofaTeam obj = new MaximumPerformanceofaTeam();
		
		int ans = obj.maxPerformance(n, sp, ef, k);
		System.out.println(ans);
	}

	public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {

		int[][] eng = new int[n][2];
		
		int MOD = (int) 1_000_000_007;
		for(int i=0;i<n;i++) {
			eng[i] = new int[] {efficiency[i],speed[i]};
		}
		Arrays.sort(eng,(a,b)-> b[0]-a[0]);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(k,(a,b)->a-b);
		
		long res = Long.MIN_VALUE, tsp = 0;
		
		for(int[] e:eng) {
			
			if(pq.size() == k ) tsp -=pq.poll();
			pq.add(e[1]);
			tsp = tsp + e[1];
			res = Math.max(res, (tsp * e[0]));
			
		}
		
		return (int) (res%MOD);
	}

}
