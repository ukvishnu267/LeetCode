package biweeklyContest51;

import java.util.ArrayList;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test4 obj = new test4();
		int[][] rooms = {{2,2},{1,2},{3,2}};
		int[][] queries = {{3,1},{3,3},{5,2}};
				
		int ans[] = new int[queries.length];
		ans = obj.closestRoom(rooms, queries);
		System.out.println(ans);
	}

	public int[] closestRoom(int[][] rooms, int[][] queries) {
		int ans[] = new int[queries.length];
		
		int[] roomis = new int[rooms.length];
		for(int i=0;i<=rooms.length;i++) {
			roomis[rooms[i][0]] = rooms[i][1];
			
		}
		for(int i=0;i<queries.length;i++) {
			int rm = queries[i][0];
			int st = queries[i][1];
			
			if(roomis[rm] >= st)
				ans[i] = rm;
			else {
				
			}
			
		}
		
		return ans;
		
	}
}
