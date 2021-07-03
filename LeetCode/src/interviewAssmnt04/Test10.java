package interviewAssmnt04;

import java.util.LinkedList;
import java.util.Queue;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("in main");
		Test10 obj = new Test10();
		int[][] g = new int[][] { { 2, 2, 0, 1 } };
		int ans = obj.orangesRotting(g);
		System.out.println(ans);
	}

	public int orangesRotting(int[][] grid) {
		// Code here

		Queue<int[]> qu = new LinkedList<>();

		// System.out.println("in method");
		int r = grid.length;
		int c = grid[0].length;
		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 2) {
					qu.offer(new int[] { i, j });
				}
			}

			// qu.offer(new int[] { -1, -1 });
		}

		int[] d = { 0, 1, 0, -1, 0 };
		int cnt = 0;
		while (!qu.isEmpty()) {
			int si = qu.size();
			boolean freshO = false;
			for (int tr = 0; tr < si; tr++) {

				int[] ele = qu.poll();
				for (int i = 0; i < d.length - 1; i++) {

					int r1 = ele[0] + d[i];
					int c1 = ele[1] + d[i + 1];
					if (r1 < r && r1 >= 0 && c1 < c && c1 >= 0) {

						if (grid[r1][c1] == 1) {
							freshO = true;
							qu.offer(new int[] { r1, c1 });
							grid[r1][c1] = 2;
						}

					}
				}

			}
			if (freshO)
				cnt++;
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					return -1;
				}
			}
			// System.out.println();
		}

		return cnt;
	}

}
