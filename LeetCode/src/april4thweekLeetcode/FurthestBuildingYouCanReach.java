package april4thweekLeetcode;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FurthestBuildingYouCanReach obj = new FurthestBuildingYouCanReach();
		int[] heights = {4,12,2,7,3,18,20,3,19};
		int bricks = 10, ladders = 2;
		int ans = obj.furthestBuilding(heights, bricks, ladders);
				
		System.out.println(ans);

	}

	public int furthestBuilding(int[] heights, int bricks, int ladders) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for( int i =1 ; i< heights.length ; i++) {
			int dif = heights[i]- heights[i-1];
			
			if(dif > 0) {
				
				if(pq.size() < ladders) {
					pq.offer(dif);
				}
				else {
					
					int br = dif;
					if(pq.size() >0 && pq.peek() < dif) {
						br = pq.remove();
						pq.offer(dif);
					}
					if(bricks - br >= 0) {
						bricks -= br;
					}else {
						return i-1; 
					}
				}
			}
			
		}
		return heights.length - 1;

	}

}
