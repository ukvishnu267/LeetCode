package june2ndweekLeetcode;

import java.util.PriorityQueue;

public class MinimumNumberofRefuelingStops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minRefuelStops(int target, int startFuel, int[][] stations) {

		int n = stations.length;
		
		PriorityQueue<int[]>  pq = new PriorityQueue<>((a,b) -> (b[1]-a[1]));
		int rf = 0, i =0;
		int dis = startFuel;
		
		while(dis < target) {
			while(i<n &&dis >= stations[i][0]) {
				pq.offer(stations[i]);
				i++;
			}
			
			if(pq.isEmpty()) return -1;
			
			dis +=pq.remove()[1];
			rf++;
			
		}
		return rf;
	}
}
